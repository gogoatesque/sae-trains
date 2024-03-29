package fr.umontpellier.iut.trains.cartes;

public enum CategoriesCarte {
    /**
     * Enumération des catégories des cartes
     */

        OR, ROUGE, VERTE, BLEU, VIOLET, GRIS;

        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
}
