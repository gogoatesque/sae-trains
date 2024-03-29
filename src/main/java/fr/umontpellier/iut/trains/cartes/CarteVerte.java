package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public abstract class CarteVerte extends Carte{
    private int cout;

    public CarteVerte(String nom, int cout) {
        super(nom);
        this.cout = cout;
    }

    @Override
    public void faireAction(Joueur joueur) {
        joueur.getJeu().choisirCaseEtAjouterRail(joueur);
        joueur.prendreFerraille();
    }
}
