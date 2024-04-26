package fr.umontpellier.iut.trains.plateau;

import java.lang.reflect.Type;

/**
 * Classe représentant une tuile de mer (tuile qui ne peut pas être occupée par
 * un rail ou une gare)
 */
public class TuileMer extends Tuile {
    private TypeTuile typeTuile = TypeTuile.MER;
    public TuileMer() {
        super();
    }

    public TypeTuile getTypeTuile() {
        return typeTuile;
    }
}
