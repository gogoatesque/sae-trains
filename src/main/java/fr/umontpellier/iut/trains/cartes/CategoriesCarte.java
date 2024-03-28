package fr.umontpellier.iut.trains.cartes;

public class CategoriesCarte {
    /**
     * Enumération des catégories des cartes
     */
    public enum CouleurJoueur {
        OR, ROUGE, VERTE, BLEU, VIOLET, GRIS;

        @Override
        public String toString() {
            return switch (this) {
                case OR -> "or";
                case ROUGE -> "rouge";
                case VERTE -> "verte";
                case BLEU -> "bleu";
                case VIOLET -> "violet";
                case GRIS -> "gris";
            };
        }
    }
}
