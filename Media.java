public class Media {
    private String title;
    private String auteur;
    private String ISBN;
    private double price;

    public Media(String title, String auteur, String ISBN, double price) {
        this.title = title;
        this.auteur = auteur;
        this.ISBN = ISBN;
        this.price = price;
    }
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuteur() {
        return auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }
    public String getMediaType(){
        return "Media";
    }

    @Override
    public String toString() {
        return String.format(
                "%s%n%-7s : %s%n%-7s : %s%n%-7s : %s%n%-7s : %.2f SAR",
                getMediaType(),
                "Title",  title,
                "Auteur", auteur,
                "ISBN",   ISBN,
                "Price",  price
        );
}
}
