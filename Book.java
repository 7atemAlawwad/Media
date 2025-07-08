import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    private int stock;
    private List<Review> review;

    public Book(String title, String auteur, String ISBN, double price, int stock) {
        super(title , auteur , ISBN , price );
        this.stock = 100;
        this.review = new ArrayList<>();
    }


    public int getStock() {
        return stock;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
    public List<Review> getReview() {
        return review;
    }
    public void setReview(List<Review> review) {
        this.review = review;
    }

    public void addReview(Review r){
        this.review.add(r);
        System.out.println("Review added");
    }

    public double getAverageRating(){
        double sum = 0;
        for(int i = 0 ; i < this.review.size() ; i++){
            sum += this.review.get(i).getRating();
        }
        return sum / this.review.size();

    }

    public void purchase(User user){
        if(this.stock > 0){
            System.out.println("Book has been purchased");
            user.addToCart(this);
            this.stock--;
        }
        else{
            System.out.println("No stock left");
        }
    }

    public boolean isBestSeller(){
        if(this.getAverageRating() >= 4.5){
            return true;
        }
        else {
            return false;
        }
    }

    public void restock(int quantity){
    this.stock += quantity;
    System.out.println("Stock has been increased by " + quantity);
    }

    @Override
    public String getMediaType() {
        if (this.getAverageRating() >= 4.5) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return String.format(
                "%s%n%-7s : %d%n%-7s : %.1f ★",
                super.toString(),
                "Stock",  stock,
                "Rating", getAverageRating()
        );
    }
}
