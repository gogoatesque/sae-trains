package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.Iterator;

public class Decharge extends CarteRouge {
    public Decharge() {
        super("Décharge", 2, 0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        ListeDeCartes main = joueur.getMain();
        for (Iterator<Carte> it = main.iterator(); it.hasNext();) {
            Carte c = it.next();
            if(c.getNom().equals("Ferraille")) {
                it.remove();
                joueur.getJeu().ajouterDansLaReserve(c);
            }
        }
    }
}
