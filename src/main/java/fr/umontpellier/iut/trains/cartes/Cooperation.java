package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Cooperation extends CarteVerte {
    public Cooperation() {
        super("Coopération", 5);
    }

    @Override
    public void activerEffet(Joueur joueur) {
        joueur.ajouterEffet(TypesEffet.COOPERATION);
        joueur.getJeu().log("Vous avez activé l'effet cooperation");
    }
}
