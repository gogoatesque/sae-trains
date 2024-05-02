package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;

public class Aiguillage extends CarteRouge {
    public Aiguillage() {
        super("Aiguillage", 5, 0);
    }

    @Override
    public void faireAction(Joueur joueur, Carte carteJouee) {
        for(Carte carte : joueur.piocher(2)){
            joueur.ajouterCarteEnMain(carte);
        }
    }
}
