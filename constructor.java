class User {
    String username;
    String email;
    int followers;

    // Constructor to automatically set up the user
    User(String username, String email, int followers) {
        this.username = username;
        this.email = email;
        this.followers = followers;
    }

    void postPhoto(String photoDescription) {
        System.out.println(username + " posted a photo: " + photoDescription);
    }
}

public class constructor {
    public static void main(String[] args) {
        // Creating a User object
        User Ria = new User("Shiva", "ria88@gmail.com", 300);

        // Using the postPhoto method
        Ria.postPhoto("Sunset at the beach!");
    }
}