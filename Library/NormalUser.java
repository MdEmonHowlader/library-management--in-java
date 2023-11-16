package Library;
import java.util.*;
public class NormalUser extends User{
    public NormalUser(String name){
        super(name);
        this.operation=new IOOperation[]{
            new ViewBooks(),
            new SearchBook(),
            new PlaceOrder(),
            new BorrowBooks(),
            new CalculateFine(),
            new ReturnBooks(),
            new Exit()

        };
    }
    public NormalUser(String name, String email, String phoneNumber){
        super( name , email, phoneNumber);
        this.operation=new IOOperation[]{
            new ViewBooks(),
            new SearchBook(),
            new PlaceOrder(),
            new BorrowBooks(),
            new CalculateFine(),
            new ReturnBooks(),
            new Exit()

        };
    }
    public void manu(Databace databace, User user){
        System.out.println("1. View Books");
        System.out.println("2. Search");
        System.out.println("3. Place order");
        System.out.println("4. Borrow Book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Book");
        System.out.println("7. Exit");

        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        this.operation[n-1].oper(databace, user);
        s.close();
        
    }
}
