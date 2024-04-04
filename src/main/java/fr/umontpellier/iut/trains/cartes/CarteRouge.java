package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class CarteRouge extends Carte{

    private final int valeur;

    public CarteRouge(String nom, int cout, int valeur) {
        super(nom, cout);
        this.valeur = valeur;
        addCategorie(CategoriesCarte.ROUGE);
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.addArgent(valeur);
    }

    public int getValeur() {
        return valeur;
    }
}
