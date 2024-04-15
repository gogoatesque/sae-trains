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
            for (int i=0 ; i<76 ; i++){choix.add("TUILE:" + i);}
            Tuile tuile = joueur.getJeu().getTuiles().get(Integer.parseInt(joueur.choisir("Choisissez une case où placer un rail",choix,null,false).substring(6)));
            if(tuile instanceof TuileVille) {
                //constuire une gare (à voir plus tard)
            }
        }
        Carte ferraille = joueur.getJeu().prendreDansLaReserve("Ferraille");
        if (ferraille != null) joueur.addCarteRecue(ferraille);
    }
}
