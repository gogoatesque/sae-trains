package fr.umontpellier.iut.trains.cartes;

public enum TypesEffet {

    /*Enumération des types d'effets, selon le nom de leur Carte*/
    COOPERATION, DEPOTOIR, FERRONERIE, PONTACIER, TRAINMATINAL, TUNNEL, VIADUC, VOIESOUTERRAINE;
    @Override
    public String toString() {
        return super.toString().toLowerCase();
    }
}
