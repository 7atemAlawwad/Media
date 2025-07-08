import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private List<Media> purchasedMediaList;
    private List<Media> shoppingCart;


    public User(String username, String email , Media[] purchasedMediaList) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();

    }
    public String getUsername() {
        return username;
    }
    public String getEmail() {
        return email;
    }
    public List<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }
    public List<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPurchasedMediaList(List<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public void setShoppingCart(List<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addToCart(Media media){
        for(int i = 0 ; i < shoppingCart.size() ; i++){
            if(shoppingCart.get(i) == null){
                shoppingCart.set(i , media);
                return;
            }
            else if(shoppingCart.get(i).getTitle().equals(media.getTitle())){
                System.out.println("This media is already in your cart");
            }

        }
    }

    public void removeFromCart(Media media){
        for(int i = 0 ; i < shoppingCart.size() ; i++){
            if(shoppingCart.get(i) == null){
                System.out.println("This media is not in your cart");
            }
            else if(shoppingCart.get(i).getTitle().equals(media.getTitle())){
                shoppingCart.set(i , null);
                return;
            }
        }

    }

    public void checkout(){
        for(int i = 0 ; i < shoppingCart.size() ; i++){
            if(shoppingCart.get(i) != null){
                System.out.println(shoppingCart.get(i).getTitle() + " has been added to your purchased media list");
                purchasedMediaList.add(shoppingCart.get(i));
                shoppingCart.set(i , null);
            }
        }
    }

}
