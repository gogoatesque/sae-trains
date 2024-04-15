package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Decharge extends CarteRouge {
    public Decharge() {
        super("Décharge", 2, 0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        for (Carte c : joueur.getMain()) {
            if(c.getNom() == "Ferraille") {
                joueur.getJeu().ajouterDansLaReserve(c);
                joueur.enleverCarteMain(c);
            }
        }
    }
}
