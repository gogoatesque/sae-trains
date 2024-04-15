package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class FeuDeSignalisation extends CarteRouge {
    public FeuDeSignalisation() {
        super("Feu de signalisation", 2,0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        Carte c = joueur.piocher();
        joueur.ajouterCarteEnMain(c);
        c = joueur.piocher();
        if (c != null) {
            List<String> listeChoix = new ArrayList<>();
            listeChoix.add("oui");
            listeChoix.add("non");
            String choix = joueur.choisir("Voulez-vous défausser la carte (oui) ou replacer au dessus de la pioche (non) ?", listeChoix, null, false);
            if (choix.equals("oui")) joueur.placerCarteDefausse(c);
            else if (choix.equals("non")) joueur.placerDansPioche(c);
        }
    }
}
