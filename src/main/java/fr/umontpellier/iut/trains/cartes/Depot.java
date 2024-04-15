package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class Depot extends CarteRouge {
    public Depot() {
        super("Dépôt",2,1);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<Carte> listeCartePiochee = joueur.piocher(2);
        List<String> listeChoix = new ArrayList<>();
        for (Carte c : listeCartePiochee) joueur.ajouterCarteEnMain(c);
        for(Carte c : joueur.getMain()) listeChoix.add(c.getNom());
        String s = joueur.choisir("Choisissez la carte à défausser", listeChoix, null, false);
        joueur.placerCarteDefausse(joueur.getMain().getCarte(s));
        joueur.enleverCarteMain(joueur.getMain().getCarte(s));
        if (!joueur.getMain().isEmpty()) {
            s = joueur.choisir("Choisissez la carte à défausser", listeChoix, null, false);
            joueur.placerCarteDefausse(joueur.getMain().getCarte(s));
            joueur.enleverCarteMain(joueur.getMain().getCarte(s));
        }
    }
}
