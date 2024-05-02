package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class TrainMatinal extends CarteRouge {
    public TrainMatinal() {
        super("Train matinal",5,2);
        addCategorie(CategoriesCarte.BLEU);
    }


    @Override
    public void faireAction(Joueur joueur, Carte carteJouee) {
        joueur.ajouterEffet(TypesEffet.TRAINMATINAL);
        joueur.getJeu().log("Vous avez activé l'effet train matinal");
    }
}
