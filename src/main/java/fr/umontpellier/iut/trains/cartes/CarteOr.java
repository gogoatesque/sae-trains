package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public abstract class CarteOr extends Carte{
    private int pv;

    public CarteOr(String nom, int cout, int pv) {
        super(nom,cout);
        this.pv = pv;
        addCategorie(CategoriesCarte.OR);
    }

    @Override
    public void jouerCarte(Joueur joueur) {
    }

    public void faireAction(Joueur joueur){
        joueur.addPv(getPv());
    }

    public int getPv() {
        return pv;
    }
}
