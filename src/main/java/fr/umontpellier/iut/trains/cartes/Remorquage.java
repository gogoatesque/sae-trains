package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Bouton;
import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class Remorquage extends CarteRouge {
    public Remorquage() {
        super("Remorquage",3,0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<String> choix = new ArrayList<>();
        List<Bouton> boutons = new ArrayList<>();
        for (Carte carte : joueur.getDefausse()) {
            if (carte.getCategorie().contains(CategoriesCarte.BLEU)) {
                choix.add(carte.getNom());
                boutons.add(new Bouton(carte.getNom()));
            }
        }
        Carte train = joueur.getDefausse().getCarte(joueur.choisir("Choisissez une cartes Train de votre défausse", choix, boutons, false));
        if (train != null) {
            joueur.ajouterCarteEnMain(joueur.prendreCarteDefausse(train));
        }
    }
}
