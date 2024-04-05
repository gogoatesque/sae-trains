package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class BureauDuChefDeGare extends CarteRouge {
    public BureauDuChefDeGare() {
        super("Bureau du chef de gare", 4, 0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<String> choix = new ArrayList<>();
        for (Carte carte : joueur.getMain()) {
            if (carte.getCategorie().contains(CategoriesCarte.ROUGE)) choix.add(carte.getNom());
        }
        Carte action = joueur.getMain().getCarte(joueur.choisir("Choisissez votre carte action", choix, null, false));
        if (action != null) action.activerEffet(joueur);
    }
}
