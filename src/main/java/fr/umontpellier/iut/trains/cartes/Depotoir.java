package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Depotoir extends CarteRouge {
    public Depotoir() {
        super("Dépotoir", 5,1);
    }

    @Override
    public void faireAction(Joueur joueur, Carte carteJouee) {
        joueur.ajouterEffet(TypesEffet.DEPOTOIR);
        joueur.getJeu().log("Vous avez activé l'effet dépotoir");
    }
}
