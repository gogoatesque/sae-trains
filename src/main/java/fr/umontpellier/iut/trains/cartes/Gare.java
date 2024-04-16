package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;
import fr.umontpellier.iut.trains.plateau.Tuile;
import fr.umontpellier.iut.trains.plateau.TuileVille;

import java.util.ArrayList;
import java.util.List;

public class Gare extends Carte {
    public Gare() {
        super("Gare", 3);
    }

    @Override
    public void jouerCarte(Joueur joueur) {
        if (joueur.getJeu().getNbJetonsGare() != 0) {
            List<String> choix = new ArrayList<>();
            for (int i = 0; i < 76; i++) {
                if (joueur.getJeu().getTuile(i).getTypeTuile() == "Ville" && joueur.getJeu().getTuile(i).getNbGares() < joueur.getJeu().getTuile(i).getNbGaresMax()) {
                    choix.add("TUILE:" + i);
                }
            }
            String s = joueur.choisir("Choisissez la case sur laquelle poser votre gare", choix, null, false);
            int nbTuile = Integer.parseInt(s.substring(6));
            Tuile tuile = joueur.getJeu().getTuile(nbTuile);
            tuile.poserGare(joueur);
        }
        Carte ferraille = joueur.getJeu().prendreDansLaReserve("Ferraille");
        if (ferraille != null) joueur.addCarteRecue(ferraille);
    }
}
