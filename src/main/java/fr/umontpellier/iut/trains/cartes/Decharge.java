package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Decharge extends CarteRouge {
    public Decharge() {
        super("Décharge", 2, 0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        ListeDeCartes main = joueur.getMain();
        for (int i = main.size()-1; i >= 0; i--) {
            Carte c = main.get(i);
            if(c.getNom().equals("Ferraille")) {
                joueur.enleverCarteMain(c);
                joueur.getJeu().ajouterDansLaReserve(c);
            }
        }
    }
}
