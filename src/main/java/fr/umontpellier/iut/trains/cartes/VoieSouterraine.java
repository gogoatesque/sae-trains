package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class VoieSouterraine extends Carte {
    public VoieSouterraine() {
        super("Voie souterraine",7);
    }

    @Override
    public void jouerCarte(Joueur joueur) {
        joueur.ajouterEffet(TypesEffet.VOIESOUTERRAINE);
    }
}
