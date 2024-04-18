package fr.umontpellier.iut.trains.cartes;

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
    public void faireAction(Joueur joueur) {
        List<String> choix = new ArrayList<>();
        for (Carte carte : joueur.getMain()) {
            if (carte.getCategorie().contains(CategoriesCarte.GRIS)) {
                choix.add(carte.getNom());
            }
        }
        String choisit = joueur.choisir("Tapez ferraille pour recycler ou rien pour passer", choix, null, true);
        while(!choisit.isEmpty()){
            choix.remove(choisit);
            Carte carteChoisit = joueur.getMain().getCarte(choisit);
            joueur.placerCarteMainDansReserve(carteChoisit);
            joueur.addArgent(1);
            choisit = joueur.choisir("Tapez ferraille pour recycler ou rien pour passer", choix, null, true);
        }
    }
}
