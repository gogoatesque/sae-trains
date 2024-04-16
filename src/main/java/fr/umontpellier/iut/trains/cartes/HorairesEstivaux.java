package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class HorairesEstivaux extends CarteRouge {
    public HorairesEstivaux() {
        super("Horaires estivaux",3, 0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<String> listeChoix = new ArrayList<>();
        listeChoix.add("oui");
        listeChoix.add("non");
        String choix = joueur.choisir("Voulez vous écarter la carte et recevoir 3¥ ou ne rien faire ?", listeChoix, null, false);
        if (choix.equals("oui")) {
            joueur.addArgent(3);
            joueur.ecarteCarte(this);
        }
    }
}
