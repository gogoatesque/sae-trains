package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class TGV extends CarteBleue {
    public TGV() {
        super("TGV",2,1);
        addCategorie(CategoriesCarte.ROUGE);
    }

    @Override
    public void faireAction(Joueur joueur) {
        if (joueur.getCartesEnJeu().stream().anyMatch((carte -> {return carte.getNom().equals("Train omnibus");}))){
            joueur.addArgent(1);
        }
    }
}
