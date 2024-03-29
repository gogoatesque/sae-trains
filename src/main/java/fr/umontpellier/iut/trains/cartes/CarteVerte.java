package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public abstract class CarteVerte extends Carte{

    public CarteVerte(String nom, int cout) {
        super(nom, cout);
        addCategorie(CategoriesCarte.VERTE);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.incrementerPointsRail();
        joueur.prendreFerraille();
    }
}
