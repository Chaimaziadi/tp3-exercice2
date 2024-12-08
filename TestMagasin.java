

public class TestMagasin {
    public static void main(String[] args) {

        Magasin magasin1 = new Magasin(1, "123 Rue du Marché", 50);


        Produit produit1 = new Produit(1021, "Lait", "Delice", 0.700, new Date());
        Produit produit2 = new Produit(2510, "Yaourt", "Vitalait", 1.000, new Date());


        magasin1.ajouterProduit(produit1);
        magasin1.ajouterProduit(produit2);


        magasin1.afficherMagasin();
    }
}
