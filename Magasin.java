

public class Magasin {
    private int id;
    private String adresse;
    private int capacite;
    private ArrayList<Produit> produits;


    public Magasin(int id, String adresse, int capacite) {
        this.id = id;
        this.adresse = adresse;
        this.capacite = capacite;
        this.produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        if (produits.size() < capacite) {
            if (!produits.contains(produit)) { // Eviter les doublons
                produits.add(produit);
            } else {
                System.out.println("Le produit existe déjà dans ce magasin.");
            }
        } else {
            System.out.println("Capacité maximale atteinte.");
        }
    }


    public void afficherMagasin() {
        System.out.println("Magasin ID: " + id);
        System.out.println("Adresse: " + adresse);
        System.out.println("Capacité: " + capacite);
        System.out.println("Produits dans le magasin:");
        for (Produit produit : produits) {
            System.out.println(produit);
        }
    }


    public int getNombreProduits() {
        return produits.size();
    }
}

