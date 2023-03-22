import java.util.*;

public class AllUser{
    private static ArrayList<User> allUsers;

    public AllUser(User user) {
        if(this.allUsers == null) this.allUsers = new ArrayList<User>();
        this.allUsers = allUsers;
        addUserArray(user);
    }
    
    protected void addUserArray(User user) {
        this.allUsers.add(user);
    }
    
    public static ArrayList<User> getAllUsers() {
        return allUsers;
    }
}  
