package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class Tunnel extends CarteVerte {
    public Tunnel() {
        super("Tunnel",5);
    }

    @Override
    public void activerEffet(Joueur joueur) {
        joueur.ajouterEffet(TypesEffet.TUNNEL);
        joueur.getJeu().log("Vous avez activé l'effet Tunnel");
    }
}
