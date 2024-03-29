package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public abstract class CarteBleue extends Carte {

    private int valeur;

    public CarteBleue(String nom, int valeur, int cout) {
        super(nom, cout);
        this.valeur = valeur;
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.addArgent(valeur);
    }
}
