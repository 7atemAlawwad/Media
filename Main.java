import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {




        Media book     = new Media("Effective Java", "Joshua Bloch", "978-0134685991", 45.99);
        Media magazine = new Media("National Geographic – Jul 2025", "NatGeo Society", "NG-2025-07", 9.99);

        System.out.println("=== Initial catalogue ===");
        System.out.println(book);
        System.out.println();
        System.out.println(magazine);

        book.setPrice(39.99);
        magazine.setAuteur("National Geo. Team");

        System.out.println("\n=== After updates ===");
        System.out.println(book);
        System.out.println();
        System.out.println(magazine);
        System.out.println();


        User hatem = new User("Hatem", "haaa@gmail.com", new Media[0] );
        User khalid = new User("khalid", "khalid@gmail.com", new Media[0] );


        Music track1 = new Music("Shape of You", "Ed Sheeran", "ISRC-123",  7.50, "Ed Sheeran");
        Music track2 = new Music("Bad Habits",  "Ed Sheeran", "ISRC-456", 11.99, "Ed Sheeran");
        Music track3 = new Music("Lose Yourself", "Eminem",   "ISRC-789",  8.99, "Eminem");

        List<Music> catalogue = new ArrayList<>(List.of(track1, track2, track3));

        System.out.println("=== Catalogue ===");
        catalogue.forEach(System.out::println);
        System.out.println();

        System.out.println("=== Listen to a track ===");
        track1.listen(hatem);
        System.out.println();
        track1.listen(khalid);
        System.out.println();

        List<Music> playlist = track1.generatePlaylist(catalogue);

        System.out.println("=== Auto-generated playlist (same artist) ===");
        playlist.forEach(m -> System.out.println(m.getTitle()));


        Book book1 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 45.99, 100);
        Book book2 = new Book("Effective Java", "Joshua Bloch", "978-0134685991", 45.99, 100);

        System.out.println("\n=== Books ===");
        System.out.println(book1);
        System.out.println();
        System.out.println(book2);
        System.out.println();

        book1.addReview(new Review("Hatem", 5, "Great book"));
        book1.addReview(new Review("khalid", 4, "Very good book"));

        book2.addReview(new Review("Hatem", 3, "Very bad book"));
        book2.addReview(new Review("khalid", 5, "Great book"));
        System.out.println("Average rating for book1: "+book1.getAverageRating());
        System.out.println("Average rating for book2: "+book2.getAverageRating());
        System.out.println("\n=== Bestselling books ===");
        System.out.println(book1.isBestSeller());
        System.out.println(book2.isBestSeller());

        System.out.println("\n=== Restocking books ===");
        book1.restock(10);
        System.out.println("Book1 stock: "+book1.getStock());

        book2.restock(30);
        System.out.println("Book2"+book2.getStock());

        System.out.println("\n=== Purchase books ===");
        book1.purchase(hatem);
        book2.purchase(khalid);

        System.out.println("=== Purchases ===");
        hatem.getPurchasedMediaList().forEach(System.out::println);
        System.out.println();
        khalid.getPurchasedMediaList().forEach(System.out::println);

        System.out.println("\n=== Checkout books ===");
        hatem.checkout();
        khalid.checkout();

        System.out.println("=== Purchases after checkout ===");
        hatem.getPurchasedMediaList().forEach(System.out::println);
        System.out.println();
        khalid.getPurchasedMediaList().forEach(System.out::println);

        System.out.println("\n=== Search books ===");
        Store store = new Store(new User[2], new Media[2]);
        store.addMedia(book1);
        store.addMedia(book2);
        store.addMedia(magazine);


        Review r1 = new Review("Hatem",   5, "Excellent sound quality!");
        Review r2 = new Review("Aisha",   4, "Great track but a bit pricey.");
        Review r3 = new Review("Faisal",  3, "Average—expected more lyrics.");

        List<Review> reviews = new ArrayList<>(List.of(r1, r2, r3));

        System.out.println("=== Initial reviews ===");
        reviews.forEach(System.out::println);

        r3.setRating(4);
        r3.setComment("Actually, it grew on me after a few listens!");

        System.out.println("\n=== After update ===");
        reviews.forEach(System.out::println);




        Movie m1 = new Movie("Inception",     "Christopher Nolan", "ISBN-1001", 12.99, 148);
        Movie m2 = new Movie("Interstellar",  "Christopher Nolan", "ISBN-1002", 14.99, 169);
        Movie m3 = new Movie("Dunkirk",       "Christopher Nolan", "ISBN-1003", 11.99, 106);
        Movie m4 = new Movie("La La Land",    "Damien Chazelle",   "ISBN-2001",  8.99, 128);

        List<Movie> catalogueMovie = new ArrayList<>(List.of(m1, m2, m3, m4));

        System.out.println("=== All movies ===");
        catalogueMovie.forEach(System.out::println);
        System.out.println();

        m1.watch(hatem);
        System.out.println();

        List<Movie> recs = m1.recommendSimilarMovies(catalogueMovie);

        System.out.println("=== Recommended (same auteur) ===");
        recs.forEach(movie -> System.out.println(movie.getTitle()));


        AcademicBook algoBook = new AcademicBook(
                "Introduction to Algorithms", "Thomas H. Cormen",
                "978-0262046305",  89.99,  25, "Computer Science"
        );

        algoBook.addReview(new Review("Hatem", 5,
                "Essential reference for any CS student."));
        algoBook.addReview(new Review("Aisha", 4,
                "Dense but rewarding."));
        algoBook.addReview(new Review("Faisal", 5,
                "Clear explanations and great exercises."));

        System.out.println(algoBook);

        Novel dune = new Novel(
                "Dune", "Frank Herbert",
                "978-0441172719", 39.50, 40, "Science-Fiction"
        );

        dune.addReview(new Review("Hatem", 5, "Masterpiece of world-building."));
        dune.addReview(new Review("Aisha", 4, "Slow start but worth it."));
        dune.addReview(new Review("Faisal", 5, "My favourite sci-fi novel."));

        System.out.println(dune);


        /* 1️⃣  Prepare empty arrays for the store */
        User[]  userSlots   = new User[3];
        Media[] catalogSlot = new Media[6];

        Store store1 = new Store(userSlots, catalogSlot);

        store.addUser(new User("Hatem", "aaa@gmail.com", new Media[0]));
        store.addUser(new User("Aisha" , "qqq@gmail.com" , new Media[0]));
        store.addUser(new User("Faisal" , "eee@gmail.com" , new Media[0]));
        store.addUser(new User("Hatem" , "lll@gmail.com" , new Media[0]));

        store.displayUsers();
        System.out.println();

        Book  artOfWar = new Book ("The Art of War", "Sun Tzu",
                "978-1590302255", 24.00, 15);
        Novel d     = new Novel("Dune", "Frank Herbert",
                "978-0441172719", 39.50, 40, "Sci-Fi");
        Movie inception = new Movie("Inception", "Christopher Nolan",
                "ISBN-Nolan-01", 12.99, 148);

        store1.addMedia(artOfWar);
        store1.addMedia(d);
        store1.addMedia(inception);
        store1.addMedia(d);
        store1.displayMedias();
        System.out.println();

        store1.searchBook("Dune");
        store1.searchBook("Unknown Title");

    }

}






