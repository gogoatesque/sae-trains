package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class Echangeur extends CarteRouge {
    public Echangeur() {
        super("Échangeur", 3, 1);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<String> listeChoix = new ArrayList<>();
        for(Carte c : joueur.getCartesEnJeu()) {
            if (c.getCategorie().contains(CategoriesCarte.BLEU)) listeChoix.add(c.getNom());
        }
        String s = joueur.choisir("Choisissez une carte Train à remettre sur la pioche", listeChoix, null, true);
        if (!s.equals("")) {
            Carte c = joueur.getCartesEnJeu().getCarte(s);
            joueur.getJeu().log("Vous avez choisi : " + c.getNom());
            joueur.placerDansPioche(c);
            joueur.enleverCarteEnJeu(c);
        }
    }
}
