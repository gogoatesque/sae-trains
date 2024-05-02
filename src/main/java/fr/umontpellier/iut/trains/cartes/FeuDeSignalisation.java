package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Bouton;
import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class FeuDeSignalisation extends CarteRouge {
    public FeuDeSignalisation() {
        super("Feu de signalisation", 2,0);
    }

    @Override
    public void faireAction(Joueur joueur,Carte carteJouee) {
        Carte c = joueur.piocher();
        joueur.ajouterCarteEnMain(c);
        c = joueur.piocher();
        if (c != null) {
            joueur.getJeu().log("Vous consultez la carte : " + c.getNom());
            List<String> listeChoix = new ArrayList<>();
            listeChoix.add("oui");
            listeChoix.add("non");
            List<Bouton> boutons = new ArrayList<>();
            boutons.add(new Bouton("Défausser", "oui"));
            boutons.add(new Bouton("Replacer sur la pioche", "non"));
            String choix = joueur.choisir("Voulez-vous défausser la carte (oui) ou replacer au dessus de la pioche (non) ?", listeChoix, boutons, false);
            if (choix.equals("oui")) {
                joueur.placerCarteDefausse(c);
                joueur.getJeu().log("Vous avez choisi de défausser : " + c.getNom());
            }
            else if (choix.equals("non")) {
                joueur.placerDansPioche(c);
                joueur.getJeu().log("Vous avez choisi de remettre " + c.getNom() + " sur la pioche");
            }
        }
    }
}
