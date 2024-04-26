package fr.umontpellier.iut.trains.plateau;

import fr.umontpellier.iut.trains.Joueur;
import fr.umontpellier.iut.trains.cartes.TypesEffet;

import java.lang.reflect.Type;

/**
 * Classe représentant une tuile plaine, fleuve ou montagne.
 */
public class TuileTerrain extends Tuile {
    /**
     * Type de terrain de la tuile ({@code PLAINE}, {@code FLEUVE} ou {@code MONTAGNE})
     */
    private TypeTerrain type;
    private TypeTuile typeTuile = TypeTuile.TERRAIN;

    public TuileTerrain(TypeTerrain type) {
        super();
        this.type = type;
    }

    public TypeTuile getTypeTuile() {
        return typeTuile;
    }

    @Override
    public int coutPoseRail(Joueur joueur) {
        if (joueur.getEffetsActifs().contains(TypesEffet.VOIESOUTERRAINE)){
            return super.coutPoseRail(joueur);
        }
        else {
            switch (type) {
                case PLAINE -> {
                    return super.coutPoseRail(joueur);
                }
                case FLEUVE -> {
                    if (joueur.getEffetsActifs().contains(TypesEffet.PONTACIER)){
                        return super.coutPoseRail(joueur);
                    }
                    else{
                        return super.coutPoseRail(joueur)+1;
                    }
                }
                case MONTAGNE -> {
                    if (joueur.getEffetsActifs().contains(TypesEffet.TUNNEL)){
                        return super.coutPoseRail(joueur);
                    }
                    else{
                        return super.coutPoseRail(joueur)+2;
                    }
                }
            }
        }
        return super.coutPoseRail(joueur); // impossible d'atteindre ce return mais besoin pour compiler
    }
}
