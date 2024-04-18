package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class CabineDuConducteur extends CarteRouge {
    public CabineDuConducteur() {
        super("Cabine du conducteur", 2, 0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<String> listeChoix = new ArrayList<>();
        int nbCarte = 0;
        for (Carte carte : joueur.getMain()) {listeChoix.add(carte.getNom());}
        String choix = joueur.choisir("Choisissez vos cartes à défausser", listeChoix, null, true);
        while(!choix.isEmpty()) {
            joueur.defausserCarte(joueur.getMain().getCarte(choix));
            listeChoix.remove(choix);
            nbCarte++;
            choix = joueur.choisir("Choisissez vos cartes à défausser", listeChoix, null, true);
        }
        for(Carte carte : joueur.piocher(nbCarte)){
            joueur.ajouterCarteEnMain(carte);
        }
    }
}
