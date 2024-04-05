package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class TrainDeTourisme extends CarteBleue {
    public TrainDeTourisme() {
        super("Train de tourisme",4,1);
        addCategorie(CategoriesCarte.ROUGE);
    }


    @Override
    public void faireAction(Joueur joueur) {
        joueur.addPv(1);
    }
}
