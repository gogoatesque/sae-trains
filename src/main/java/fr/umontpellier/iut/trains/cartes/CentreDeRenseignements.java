package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.List;

public class CentreDeRenseignements extends CarteRouge {
    public CentreDeRenseignements() {
        super("Centre de renseignements", 4, 1);
    }

    @Override
    public void faireAction(Joueur joueur) {
        List<Carte> listeCartePiochee = joueur.piocher(4);
        List<String> listeChoix = new ArrayList<>();
        for(Carte carte : listeCartePiochee) listeChoix.add(carte.getNom());
        String choix = joueur.choisir("Choisissez la carte que vous voulez garder", listeChoix, null, true);
        if (!choix.equals("")){
            for(Carte c : listeCartePiochee) {
                if (c.getNom() == choix) {
                    joueur.ajouterCarteEnMain(c);
                    listeChoix.remove(choix);
                    break;
                }
            }
        }
        for(String s : listeChoix) {
            choix = joueur.choisir("Choisissez la carte que vous voulez enlever", listeChoix, null, false);
            for(Carte c : listeCartePiochee) {
                if (c.getNom() == choix) {
                    joueur.placerDansPioche(c);
                    listeChoix.remove(choix);
                    break;
                }

            }
        }

    }
}
