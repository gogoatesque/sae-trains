package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class ParcDAttractions extends CarteRouge {
    public ParcDAttractions() {
        super("Parc d'attractions",4,1);

    }

    @Override
    public void faireAction(Joueur joueur) {
        super.faireAction(joueur);
        List<String> choix = new ArrayList<>();
        for (Carte carte : joueur.getCartesEnJeu()) {
            if (carte.getCategorie().contains(CategoriesCarte.BLEU)) {
                choix.add(carte.getNom());
            }
        }
        Carte train = joueur.getCartesEnJeu().getCarte(joueur.choisir("Choisissez une de vos cartes Train", choix, null, false));
        joueur.addArgent(train.getValeur());
    }
}
