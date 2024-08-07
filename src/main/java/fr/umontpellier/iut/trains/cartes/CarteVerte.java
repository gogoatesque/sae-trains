package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public abstract class CarteVerte extends Carte{

    public CarteVerte(String nom, int cout) {
        super(nom, cout);
        addCategorie(CategoriesCarte.VERTE);
    }

    @Override
    public void jouerCarte(Joueur joueur) {
        joueur.incrementerPointsRail();
        joueur.prendreFerraille();
        if(joueur.getEffetsActifs().contains(TypesEffet.FERRONERIE)) joueur.addArgent(2);
        activerEffet(joueur);
    }

    public abstract void activerEffet(Joueur joueur);

}
