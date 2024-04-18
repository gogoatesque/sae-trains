package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Immeuble extends CarteOr {
    public Immeuble() {
        super("Immeuble", 5, 2);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.addPv(getPv());
    }
}
