package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Aiguillage extends Carte {
    public Aiguillage() {
        super("Aiguillage", 5);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.piocher(2);
    }
}
