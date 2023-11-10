package Library;
import java.util.*;  
public class Databace {
    ArrayList<User> users=new ArrayList<User>();
    ArrayList<String> username= new ArrayList<String>();
    public void AddUser(User e){
        users.add(e);
        username.add(e.getName());
    }
    public int  login(String phoneNumber, String email){
        int n=-1;
        for(User u : users){
            if (u.getPhoneNumber().matches(phoneNumber) && u.getEmail().matches(email)){
                n=users.indexOf(u);
                break;
            }
        }
        return n;
    }
    public User getUser(int n){
        return users.get(n);
    }

}
 