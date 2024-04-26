package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Bouton;
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
        List<Bouton> boutons = new ArrayList<>();
        for(Carte carte : listeCartePiochee) {
            listeChoix.add(carte.getNom());
            boutons.add(new Bouton(carte.getNom()));
        }
        String choix = joueur.choisir("Choisissez la carte que vous voulez garder", listeChoix, null, true);
        if (!choix.isEmpty()){
            for(Carte c : listeCartePiochee) {
                if (c.getNom().equals(choix)) {
                    joueur.ajouterCarteEnMain(c);
                    listeChoix.remove(choix);
                    boutons.remove(new Bouton(choix));
                    break;
                }
            }
        }

        for(int i = listeChoix.size()-1; i >= 0 ; i--) {
            choix = joueur.choisir("Choisissez la carte que vous voulez enlever", listeChoix, null, false);
            for(Carte c : listeCartePiochee) {
                if (c.getNom().equals(choix)) {
                    joueur.placerDansPioche(c);
                    listeChoix.remove(choix);
                    boutons.remove(new Bouton(choix));
                    break;
                }
            }
        }

    }
}
