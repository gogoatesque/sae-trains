package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public abstract class CarteRouge extends Carte{

    private final int valeur;

    public CarteRouge(String nom, int cout, int valeur) {
        super(nom, cout);
        this.valeur = valeur;
        addCategorie(CategoriesCarte.ROUGE);
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
