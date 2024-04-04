package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class PersonnelDeGare extends CarteRouge {
    public PersonnelDeGare() {
        super("Personnel de gare",2,0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<String> choix = new ArrayList<>(Arrays.asList("piocher", "argent", "ferraille"));
        String action = joueur.choisir("Choisissez entre 'piocher', 'argent' et 'ferraille'", choix, null, false);
        switch (action) {
            case "piocher" -> joueur.piocher();
            case "argent" -> joueur.addArgent(1);
            case "ferraille" -> {
                for (Carte carte : joueur.getMain()) {
                    if (carte.getCategorie().contains(CategoriesCarte.GRIS)) {
                        joueur.getJeu().ajouterDansLaReserve(carte);
                        joueur.enleverCarteMain(carte);
                        break;
                    }
                }
            }
        }
    }
}
