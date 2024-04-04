package fr.umontpellier.iut.trains.cartes;

public abstract class CarteOr extends Carte{
    private int pv;

    public CarteOr(String nom, int cout, int pv) {
        super(nom,cout);
        this.pv = pv;
    }

    public int getPv() {
        return pv;
    }
}
