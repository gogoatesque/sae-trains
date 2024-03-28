package fr.umontpellier.iut.trains.cartes;

public abstract class CarteVerte extends Carte{
    private int cout;

    public CarteVerte(String nom, int cout) {
        super(nom);
        this.cout = cout;
    }
}
