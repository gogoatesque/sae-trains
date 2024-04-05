package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

public class SalleDeControle extends CarteRouge {
    public SalleDeControle() {
        super("Salle de contrôle",3,0);
    }

    @Override
    public void faireAction(Joueur joueur) {
        for (Carte carte :joueur.piocher(3)){
            joueur.ajouterCarteEnMain(carte);
        }
    }
}
