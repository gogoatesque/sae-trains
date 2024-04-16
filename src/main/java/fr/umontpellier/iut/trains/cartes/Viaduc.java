package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Viaduc extends Carte {
    public Viaduc() {
        super("Viaduc",5);
    }

    @Override
    public void jouerCarte(Joueur joueur) {
        joueur.ajouterEffet(TypesEffet.VIADUC);
    }
}
