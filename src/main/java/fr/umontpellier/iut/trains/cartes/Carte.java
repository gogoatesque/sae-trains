package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Carte {
    private final String nom;
    private final int cout;

    private ArrayList<CategoriesCarte> categorie = new ArrayList<>();

    /**
     * Constructeur simple
     * <p>
     * Important : La classe Carte est actuellement très incomplète. Vous devrez
     * ajouter des attributs et des méthodes et donc probablement définir au moins
     * un autre constructeur plus complet. Les sous-classes de Cartes qui vous sont
     * fournies font appel à ce constructeur simple mais au fur et à mesure que vous
     * les compléterez, elles devront utiliser les autres constructeurs de Carte. Si
     * vous n'utilisez plus ce constructeur, vous pouvez le supprimer.
     *
     * @param nom, valeur, cout
     */
    public Carte(String nom, int cout) {
        this.nom = nom;
        this.cout = cout;
    }

    public String getNom() {
        return nom;
    }    

    /**
     * Cette fonction est exécutée lorsqu'un joueur joue la carte pendant son tour.
     * Toutes les cartes ont une méthode jouer, mais elle ne fait rien par défaut.
     * 
     * @param joueur le joueur qui joue la carte
     */
    public void jouer(Joueur joueur) {
        this.jouerCarte(joueur);
    }

    public abstract void jouerCarte(Joueur Joueur);

    public ArrayList<CategoriesCarte> getCategorie(){
        return categorie;
    }

    public void addCategorie(CategoriesCarte valeur){
        categorie.add(valeur);
    }

    @Override
    public String toString() {
        return nom;
    }

    public int getCout() {
        return cout;
    }

    public int getValeur() {
        return 0;
    }

    public int getPv() {
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carte carte = (Carte) o;
        return nom.equals(carte.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom);
    }
}
