import java.util.ArrayList;
import java.util.List;

public class Movie extends Media {
    // duration in minutes
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price, int duration) {
        super(title , auteur , ISBN , price );
        this.duration = duration;
    }
    public void watch(User user){
        user.addToCart(this);
        System.out.println("Movie has been added to your purchased list");

    }

    public List<Movie> recommendSimilarMovies(List<Movie> catalogue) {
        List<Movie> similar = new ArrayList<>();
        for (Movie m : catalogue) {
            if (m.getAuteur().equalsIgnoreCase(this.getAuteur()) && m != this) {
                similar.add(m);
            }
        }
        if (similar.isEmpty()) {
            System.out.println("No similar movies found");
        }
        return similar;
    }

    @Override
    public String getMediaType() {
        if (this.duration >= 120) {
            return "Long Movie";
        }
        else {
            return "Movie";
        }
    }

    public String toString() {
        return String.format(
                "%s%n%-7s : %d min%n%-7s : %s",
                super.toString(),
                "Length", duration,
                "Type",   getMediaType()
        );
    }
}
