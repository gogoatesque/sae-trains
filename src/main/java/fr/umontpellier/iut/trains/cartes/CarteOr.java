package fr.umontpellier.iut.trains.cartes;

public abstract class CarteOr extends Carte{
    private int pv;

    public CarteOr(String nom, int pv) {
        super(nom);
        this.pv = pv;
    }
}
