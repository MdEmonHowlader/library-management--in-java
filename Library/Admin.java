package Library;

// import AddBooks;
// import IOOperation;

public class Admin extends User{
    public Admin(String name){
        super(name);
    }
    public Admin(String name, String email, String phoneNumber){
        super( name , email, phoneNumber);
        this.operation=new IOOperation[]{
            new AddBooks()
        };
    }
    @Override
    public void manu(){
        System.out.println("1. View Books");
        System.out.println("2. Add Book");
        System.out.println("3. Delete Book");
        System.out.println("4. Search");
        System.out.println("5. Delete all date");
        System.out.println("6. View Orders");
        System.out.println("7. Exit");

    }
    
}
