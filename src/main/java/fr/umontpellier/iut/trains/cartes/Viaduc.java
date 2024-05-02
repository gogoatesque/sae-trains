package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Viaduc extends CarteVerte {
    public Viaduc() {
        super("Viaduc",5);
    }

    @Override
    public void activerEffet(Joueur joueur) {
        joueur.ajouterEffet(TypesEffet.VIADUC);
        joueur.getJeu().log("Vous avez activé l'effet viaduc");
    }
}
