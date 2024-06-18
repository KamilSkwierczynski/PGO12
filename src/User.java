import java.util.ArrayList;

public class User {
    static ArrayList<User> users = new ArrayList<>();
    String fName;
    String lName;

    public User(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;
        addUser(this);
        removeUser(this);
    }
    public static void addUser(User user) {
        users.add(user);
    }
    public static void removeUser(User user) {
        users.remove(user);
    }
}
