package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class SalleDeControle extends CarteRouge {
    public SalleDeControle() {
        super("Salle de contrôle",7,0);
    }

    @Override
    public void faireAction(Joueur joueur, Carte carteJouee) {
        for (Carte carte :joueur.piocher(3)){
            joueur.ajouterCarteEnMain(carte);
        }
    }
}
