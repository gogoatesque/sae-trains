package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Bouton;
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
        List<Bouton> boutons = new ArrayList<>();
        boutons.add(new Bouton("Piocher", "piocher"));
        boutons.add(new Bouton("Argent", "argent"));
        boutons.add(new Bouton("Ferraille", "ferraille"));
        String action = joueur.choisir("Choisissez entre 'piocher', 'argent' et 'ferraille'", choix, boutons, false);
        switch (action) {
            case "piocher" -> joueur.ajouterCarteEnMain(joueur.piocher());
            case "argent" -> joueur.addArgent(1);
            case "ferraille" -> {
                ListeDeCartes main = joueur.getMain();
                for (int i = main.size()-1; i >= 0; i--) {
                    Carte carte = main.get(i);
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
