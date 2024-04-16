package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;
import fr.umontpellier.iut.trains.plateau.Tuile;
import fr.umontpellier.iut.trains.plateau.TuileVille;

import java.util.ArrayList;
import java.util.List;

public class Gare extends Carte {
    public Gare() {
        super("Gare", 3);
    }

    @Override
    public void jouerCarte(Joueur joueur) {
        if (joueur.getJeu().getNbJetonsGare() != 0) {
            List<String> listeChoix = new ArrayList<>();
            for (int i = 0; i < 76; i++) {
                Tuile tuileVille = joueur.getJeu().getTuile(i);
                if (tuileVille.getTypeTuile() == "Ville" && tuileVille.getNbGares() < tuileVille.getNbGaresMax()) {
                    listeChoix.add("TUILE:" + i);
                }
            }
            String choix = joueur.choisir("Choisissez la case sur laquelle poser votre gare", listeChoix, null, false);
            int numeroTuile = Integer.parseInt(choix.substring(6));
            Tuile tuileChoisie = joueur.getJeu().getTuile(numeroTuile);
            tuileChoisie.poserGare(joueur);
        }
        if(!joueur.getEffetsActifs().contains(TypesEffet.DEPOTOIR)) {
            Carte ferraille = joueur.getJeu().prendreDansLaReserve("Ferraille");
            if (ferraille != null) joueur.addCarteRecue(ferraille);
        }
    }
}
