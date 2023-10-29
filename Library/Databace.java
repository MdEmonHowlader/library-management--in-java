package Library;
import java.util.*;  
public class Databace {
    ArrayList<User> users=new ArrayList<User>();
    ArrayList<String>  username= new ArrayList<String>();
    public void AddUser(User e){
        users.add(e);
        username.add(e.getName());
    }
    

}
