package fr.umontpellier.iut.trains.plateau;

import fr.umontpellier.iut.trains.Joueur;
import fr.umontpellier.iut.trains.cartes.TypesEffet;

/**
 * Classe représentant une tuile étoile (lieu éloigné)
 */
public class TuileEtoile extends Tuile {
    /**
     * Valeur du lieu éloigné (valeur indiquée sur le plateau)
     */
    private int valeur;

    public TuileEtoile(int valeur) {
        super();
        this.valeur = valeur;
    }

    public String getTypeTuile() {
        return "Etoile";
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
}
