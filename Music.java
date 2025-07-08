import java.util.ArrayList;
import java.util.List;

public class Music extends Media {
    private String artist;

    public Music(String title, String auteur, String ISBN, double price, String artist) {
        super(title , auteur , ISBN , price );
        this.artist = artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void listen(User user){
        System.out.println("You are listening to " + this.getTitle() + " by " + this.getAuteur());
    }

    public List<Music> generatePlaylist(List<Music> musicCatalog) {
        List<Music> playlist = new ArrayList<>();
        for (Music m : musicCatalog) {
            if (m.getArtist().equals(this.artist)) playlist.add(m);
        }
        playlist.add(this);
        return playlist;
    }

    @Override
    public String getMediaType() {
        if(this.getPrice() > 10){
            return "Premium Music";
        }
        else{
            return "Music";
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s%n%-7s : %s%n%-7s : %s",
                super.toString(),          // prints title, author, ISBN, price
                "Artist",  artist,
                "Type",    getMediaType()
        );
    }
}
