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
    public void jouerCarte(Joueur joueur) {
        joueur.addArgent(valeur);
        faireAction(joueur);
    }

    public abstract void faireAction(Joueur joueur);

    public int getValeur() {
        return valeur;
    }

}
