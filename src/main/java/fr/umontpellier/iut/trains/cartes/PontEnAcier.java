package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class PontEnAcier extends CarteVerte {
    public PontEnAcier() {
        super("Pont en acier",4);
    }

    @Override
    public void faireAction(Joueur joueur) {
        //effet permanent
    }
}
