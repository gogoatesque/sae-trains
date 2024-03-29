package fr.umontpellier.iut.trains.cartes;

public abstract class CarteBleue extends Carte {

    private int valeur;

    public CarteBleue(String nom, int valeur, int cout) {
        super(nom, cout);
        this.valeur = valeur;
    }

}
