package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Bouton;
import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TrainDeMarchandises extends CarteRouge {
    public TrainDeMarchandises() {
        super("Train de marchandises",4,1);
        addCategorie(CategoriesCarte.BLEU);
    }

    @Override
    public void faireAction(Joueur joueur, Carte carteJouee) {
        List<String> choix = new ArrayList<>();
        List<Bouton> boutons = new ArrayList<>();
        boutons.add(new Bouton("Ferraille", "Ferraille"));
        for (Carte carte : joueur.getMain()) {
            if (carte.getCategorie().contains(CategoriesCarte.GRIS)) {
                choix.add(carte.getNom());
            }
        }
        String choisit = joueur.choisir("Cliquez sur 'ferraille' pour recycler ou 'passer' pour passer votre tour", choix, boutons, true);
        while(!choisit.isEmpty()){
            choix.remove(choisit);
            Carte carteChoisit = joueur.getMain().getCarte(choisit);
            joueur.placerCarteMainDansReserve(carteChoisit);
            joueur.getJeu().log("Vous avez recyclé une ferraille");
            joueur.addArgent(1);
            choisit = joueur.choisir("Cliquez sur 'ferraille' pour recycler ou 'passer' pour passer votre tour", choix, boutons, true);
        }
    }
}
