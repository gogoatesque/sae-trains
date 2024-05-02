package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class HorairesTemporaires extends CarteRouge {
    public HorairesTemporaires() {
        super("Horaires temporaires", 5 ,0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        int cpt = 0;
        List<Carte> cartesPiochees = new ArrayList<>();
        while(cpt != 2) {
            Carte carte = joueur.piocher();
            if (carte == null) break;
            if (carte.getCategorie().contains(CategoriesCarte.BLEU)) {
                cpt++;
                joueur.ajouterCarteEnMain(carte);
                joueur.getJeu().log("Vous avez dévoilé une carte train, vous êtes à " + cpt + " cartes train");
            }
            else cartesPiochees.add(carte);
        }
        for (Carte c : cartesPiochees) {
            joueur.placerCarteDefausse(c);
            joueur.getJeu().log("Vous avez défaussé : " + c.getNom());
        }

    }
}
