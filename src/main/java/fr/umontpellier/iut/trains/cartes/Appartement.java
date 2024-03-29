package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Appartement extends CarteOr {
    public Appartement() {
        super("Appartement", 3, 1);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.prendreFerraille();
    }
}
