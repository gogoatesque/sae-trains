package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class UsineDeWagons extends CarteRouge {
    public UsineDeWagons() {
        super("Usine de wagons",5,0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<String> choix = new ArrayList<>();
        for (Carte carte : joueur.getMain()) {
            if (carte.getCategorie().contains(CategoriesCarte.BLEU)) choix.add(carte.getNom());
        }
        Carte train = joueur.getMain().getCarte(joueur.choisir("Choisissez une carte Train de votre main a écartée", choix, null, false));
        if(train != null) {
            joueur.ecarteCarte(train);
            choix = joueur.getJeu().getReserve().keySet().stream().filter(nomCarte -> joueur.getJeu().getReserve().get(nomCarte).getCarte(nomCarte).getCout() <= train.getValeur()+3).map(nomCarte -> "ACHAT:"+nomCarte).toList();
        }
    }
}
