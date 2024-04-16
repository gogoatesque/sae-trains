package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class GratteCiel extends CarteOr {
    public GratteCiel() {
        super("Gratte-Ciel", 8,4);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.addPv(getPv());
    }
}