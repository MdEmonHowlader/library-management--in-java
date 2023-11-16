package Library;

import java.io.File;
import java.util.*;  
public class Databace {
   private ArrayList<User> users=new ArrayList<User>();
   private ArrayList<String> username= new ArrayList<String>();
   private ArrayList<Book> books= new ArrayList<Book>();
   private ArrayList<String> bookname= new ArrayList<String>();

   private File userfile =new File(Main.class.getClassLoader().getResource("Users").getFile());
   private File booksfile =new File(Main.class.getClassLoader().getResource("Books").getFile());

    public Databace(){
        if(!userfile.exists()){
            userfile.mkdirs();
        }
          if(!booksfile.exists()){
            booksfile.mkdirs();
        }

    }
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

    public void AddBooks(Book book){
        books.add(book);
        bookname.add(book.getNmae());

    }

}
 

