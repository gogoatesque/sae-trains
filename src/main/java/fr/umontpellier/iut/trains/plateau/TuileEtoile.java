package fr.umontpellier.iut.trains.plateau;

import fr.umontpellier.iut.trains.Joueur;
import fr.umontpellier.iut.trains.cartes.TypesEffet;

import java.lang.reflect.Type;

/**
 * Classe représentant une tuile étoile (lieu éloigné)
 */
public class TuileEtoile extends Tuile {
    /**
     * Valeur du lieu éloigné (valeur indiquée sur le plateau)
     */
    private int valeur;
    private TypeTuile typeTuile = TypeTuile.ETOILE;
    public TuileEtoile(int valeur) {
        super();
        this.valeur = valeur;
    }

    public TypeTuile getTypeTuile() {
        return typeTuile;
    }

    @Override
    public int coutPoseRail(Joueur joueur) {
        if (joueur.getEffetsActifs().contains(TypesEffet.VOIESOUTERRAINE)){
            return super.coutPoseRail(joueur);
        }
        else {
            return super.coutPoseRail(joueur)+valeur;
        }
    }

    @Override
    public int getValeur() {
        return valeur;
    }
}
