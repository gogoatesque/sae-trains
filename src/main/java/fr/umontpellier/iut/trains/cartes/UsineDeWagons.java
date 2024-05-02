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
        List<String> choixMain = new ArrayList<>();
        for (Carte carte : joueur.getMain()) {
            if (carte.getCategorie().contains(CategoriesCarte.BLEU)) choixMain.add(carte.getNom());
        }
        Carte trainMain = joueur.getMain().getCarte(joueur.choisir("Choisissez une carte Train de votre main a écartée", choixMain, null, false));
        if(trainMain != null) {
            joueur.getJeu().log("Vous avez choisi la carte" + trainMain.getNom());
            List<String> choixReserve;
            joueur.ecarteCarte(trainMain);
            joueur.getMain().remove(trainMain);

            choixReserve = joueur.getJeu().getReserve().keySet().stream().filter(nomCarte -> !joueur.getJeu().getReserve().get(nomCarte).isEmpty() && joueur.getJeu().getReserve().get(nomCarte).get(0).getCategorie().contains(CategoriesCarte.BLEU) && joueur.getJeu().getReserve().get(nomCarte).get(0).getCout() <= trainMain.getCout()+3).map(nomCarte -> "ACHAT:"+nomCarte).toList();
            joueur.getJeu().log("Vous pouvez choisir parmi" + choixReserve);
            Carte trainReserve = joueur.getJeu().prendreDansLaReserve(joueur.choisir("Choisissez une carte train de la reserve coutant maximum 3 de plus", choixReserve, null, false).substring (6));
            joueur.ajouterCarteEnMain(trainReserve);
        }
        else{
            joueur.getJeu().log("Vous n'avez pas de cartes train en main");
        }
    }
}
