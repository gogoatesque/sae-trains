package fr.umontpellier.iut.trains.plateau;

import fr.umontpellier.iut.trains.Joueur;

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

    public int getNbGaresMax() {
        return nbGaresMax;
    }

    @Override
    public int getNbGares() {
        return nbGaresPosees;
    }

    public void poserGare(Joueur joueur) {
        nbGaresPosees++;
        gares.add(joueur);
    }
    public TuileVille(int taille) {
        super();
        this.nbGaresMax = taille;
        this.nbGaresPosees = 0;
    }
}
