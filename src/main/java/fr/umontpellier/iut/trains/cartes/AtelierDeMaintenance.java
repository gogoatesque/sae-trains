package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class AtelierDeMaintenance extends Carte {
    public AtelierDeMaintenance() {
        super("Atelier de maintenance", 5);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<String> choix = new ArrayList<>();
        for (Carte carte : joueur.getMain()) {
            if (carte.getCategorie().contains(CategoriesCarte.BLEU)) choix.add(carte.getNom());
        }
        Carte train = joueur.getMain().getCarte(joueur.choisir("Choisissez votre carte Train", choix, null, false));
        //joueur.addArgent(train.getV);
    }
}
