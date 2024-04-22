package fr.umontpellier.iut.trains.plateau;

import fr.umontpellier.iut.trains.Joueur;
import fr.umontpellier.iut.trains.cartes.TypesEffet;

import java.util.HashSet;
import java.util.Set;

/**
 * Classe représentant une tuile ville (où l'on peut poser des gares)
 */
public class TuileVille extends Tuile {
    private Set<Joueur> gares = new HashSet<>();
    /**
     * Nombre maximum de gares que l'on peut poser sur la tuile
     */
    private int nbGaresMax;
    /**
     * Nombre de gares posées sur la tuile
     */
    private int nbGaresPosees;

    @Override
    public int getNbGaresMax() {
        return nbGaresMax;
    }

    @Override
    public int getNbGares() {
        return nbGaresPosees;
    }

    @Override
    public void poserGare(Joueur joueur) {
        nbGaresPosees++;
        gares.add(joueur);
        joueur.getJeu().utiliseJetonGare();
    }
    public TuileVille(int taille) {
        super();
        this.nbGaresMax = taille;
        this.nbGaresPosees = 0;
    }
    public String getTypeTuile() {
        return "Ville";
    }

    @Override
    public int coutPoseRail(Joueur joueur) {
        if (joueur.getEffetsActifs().contains(TypesEffet.VOIESOUTERRAINE)){
            return super.coutPoseRail(joueur);
        }
        else if (joueur.getEffetsActifs().contains(TypesEffet.VIADUC)){
            return super.coutPoseRail(joueur);
        }
        else{
            return super.coutPoseRail(joueur)+1+getNbGares();
        }
    }

    // renvoie le nombre de points de victoire que rapporte la ville
    @Override
    public int getValeur() {
        if (nbGaresPosees < 3){
            return 2*nbGaresPosees;
        }
        else{
            return 8;
        }
    }
}
