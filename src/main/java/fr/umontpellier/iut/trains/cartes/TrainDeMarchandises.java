package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class TrainDeMarchandises extends CarteBleue {
    public TrainDeMarchandises() {
        super("Train de marchandises",4,1);
        addCategorie(CategoriesCarte.ROUGE);
    }

    @Override
    public void faireAction(Joueur joueur) {

    }
}
