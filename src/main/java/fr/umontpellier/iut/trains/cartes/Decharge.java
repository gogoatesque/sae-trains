package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.Iterator;

public class Decharge extends CarteRouge {
    public Decharge() {
        super("Décharge", 2, 0);
    }

    @Override
    public void faireAction(Joueur joueur, Carte carteJouee) {
        joueur.recycler();
    }
}
