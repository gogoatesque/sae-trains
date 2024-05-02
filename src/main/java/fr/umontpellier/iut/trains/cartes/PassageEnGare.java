package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class PassageEnGare extends CarteRouge {
    public PassageEnGare() {
        super("Passage en gare",3,1);
    }

    @Override
    public void faireAction(Joueur joueur, Carte carteJouee) {
        joueur.ajouterCarteEnMain(joueur.piocher());
    }
}
