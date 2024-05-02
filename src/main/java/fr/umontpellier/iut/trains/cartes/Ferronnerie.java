package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Ferronnerie extends CarteRouge {
    public Ferronnerie() {
        super("Ferronnerie", 4,1);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.ajouterEffet(TypesEffet.FERRONERIE);
        joueur.getJeu().log("Vous avez activé l'effet ferronerie");
    }
}
