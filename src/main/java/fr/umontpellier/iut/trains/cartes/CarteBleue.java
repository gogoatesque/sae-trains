package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public abstract class CarteBleue extends Carte {

    private final int valeur;

    public CarteBleue(String nom, int cout, int valeur) {
        super(nom, cout);
        this.valeur = valeur;
        addCategorie(CategoriesCarte.BLEU);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.addArgent(valeur);
    }

    public int getValeur() {
        return valeur;
    }

}
