package fr.umontpellier.iut.trains.cartes;

public abstract class CarteBleue extends Carte {

    private int valeur;
    private int cout;

    public CarteBleue(String nom, int valeur, int cout) {
        super(nom);
        this.valeur = valeur;
        this.cout = cout;
    }
}
