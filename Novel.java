public class Novel extends Book {
    private String genre;

    public Novel(String title, String auteur, String ISBN, double price, int stock, String genre) {
        super(title, auteur, ISBN, price, stock);
        this.genre = genre;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getMediaType() {
        if(this.getAverageRating() >= 4.5){
            return "Bestselling Novel";
        }
        else{
            return "Novel";
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s%n%-7s : %s",
                super.toString(),
                "Genre", genre
        );
    }
}
