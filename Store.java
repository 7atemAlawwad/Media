public class Store {
    private User[] users;
    private Media[] media;

    public Store(User[] users, Media[] media) {
        this.users = users;
        this.media = media;
    }

    public User[] getUsers() {
        return users;
    }
    public Media[] getMedia() {
        return media;
    }
    public void setMedia(Media[] media) {
        this.media = media;
    }
    public void setUsers(User[] users) {
        this.users = users;
    }

    public void addUser(User user){
        for (int i = 0; i < users.length; i++) {
            if (users[i] == null) {           // free slot
                users[i] = user;
                return;
            }
            if (users[i].getUsername().equalsIgnoreCase(user.getUsername())) {
                System.out.println("User already exists.");
                return;
            }
        }
        System.out.println("User list is full.");
    }

    public void displayUsers(){
        for(int i = 0 ; i < this.users.length ; i++){
            System.out.println(this.users[i].getUsername());
        }
    }

    public void addMedia(Media media) {
        for (int i = 0; i < this.media.length; i++) {
            if (this.media[i] == null) {          // free slot
                this.media[i] = media;
                return;
            }
            if (this.media[i].getTitle().equalsIgnoreCase(media.getTitle())) {
                System.out.println("This title is already in the store.");
                return;
            }
        }
        System.out.println("The store is full.");
    }

    public void displayMedias() {
        boolean found = false;
        for (Media m : media) {
            if (m != null) {
                System.out.println(m.getTitle());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No media found");
        }
    }

    public void searchBook(String title){
       boolean found = false;
       for(Media m : media){
           if(m != null && m.getMediaType().equalsIgnoreCase("Book") && m.getTitle().equalsIgnoreCase(title)){
               System.out.println(m.getTitle());
               found = true;
           }
       }
       if(!found){
           System.out.println("No book found");
       }
    }

}
