package fr.umontpellier.iut.trains.cartes;

import fr.umontpellier.iut.trains.Joueur;

import java.util.ArrayList;

public abstract class Carte {
    private final String nom;

    private ArrayList<CategoriesCarte> categorie;

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
    public Carte(String nom) {
        this.nom = nom;
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
        joueur.enleverCarteMain(this);
        this.faireAction();
        joueur.placerCarteDefausse(this);
    }

    public abstract void faireAction();

    public ArrayList<CategoriesCarte> getCategorie(){
        return categorie;
    }

    private void setCategorie(ArrayList<CategoriesCarte> valeur){
        categorie =  valeur;
    }

    @Override
    public String toString() {
        return nom;
    }
}
