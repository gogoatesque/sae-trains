package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CentreDeControle extends CarteRouge {
    public CentreDeControle() {
        super("Centre de contrôle", 3, 0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.ajouterCarteEnMain(joueur.piocher());
        Set<String> listeChoix = joueur.getJeu().getListeNomsCartes();
        String choix = joueur.choisir("Choisissez une carte", listeChoix, null, false);
        Carte carte = joueur.piocher();
        if (carte.getNom().equals(choix)) {
            joueur.ajouterCarteEnMain(carte);
        }
        else {
            joueur.placerDansPioche(carte);
        }

    }
}
