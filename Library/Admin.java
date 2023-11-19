package Library;

 import java.util.Scanner;

public class Admin extends User{
    public Admin(String name){
        super(name);
        this.operation=new IOOperation[]{
             new ViewBooks(),
            new AddBooks(),
            new DeleteBook(),
            new SearchBook(),
            new ViewOrders(),
            new DeletaAllDate(), 
            new Exit()

        };
    }
    public Admin(String name, String email, String phoneNumber){
        super( name , email, phoneNumber);
       this.operation=new IOOperation[]{
             new ViewBooks(),
            new AddBooks(),
            new DeleteBook(),
            new SearchBook(),
            new ViewOrders(),
            new DeletaAllDate(), 
            new Exit()

        };
    }
    @Override
    public void manu(Databace databace, User user){
        System.out.println("1. View Books");
        System.out.println("2. Add Book");
        System.out.println("3. Delete Book");
        System.out.println("4. Search");
        System.out.println("5. Delete all date");
        System.out.println("6. View Orders");
        System.out.println("7. Exit");

        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        this.operation[n-1].oper(databace, user);
        s.close();
    }

    	
	// @Override
	// public void manu(Databace databace, User user){
	// 	String[] data = new String[7];
	// 	data[0] = "View Books";
	// 	data[1] = "Add Book";
	// 	data[2] = "Delete Book";
	// 	data[3] = "Search";
	// 	data[4] = "Delete all data";
	// 	data[5] = "View Orders";
	// 	data[6] = "Exit";
		
	// 	// JFrame frame = this.frame(data, database, user);
	// 	// frame.setVisible(true);
	// }
	
    public String toString() {
		return name+"<N/>"+email+"<N/>"+phoneNumber+"<N/>"+"Admin";
	}


}
