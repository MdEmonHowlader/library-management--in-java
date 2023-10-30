package Library;
import java.util.*;

public class Main {
    static Scanner es;
     static Databace databace;
    public static void main(String[] args) {
      databace =new Databace();
        int num;
       do{
        System.out.println("\n\n\t\t|-------------------------------------------------------|");
        System.out.println("\t\t\t| Welcome to Library Management System: |");
        System.out.println("\t\t\t|---------------Hi Emon-----------------|\n");
               
        System.out.println("\t\t\t0. Exit\n"+ "\t\t\t1. Login\n\t\t\t2.New User");
        System.out.println("\t\t|-------------------------------------------------------|");
        es=new Scanner(System.in);
         num=es.nextInt();

        switch (num) {
            case 1:Login();
            case 2:NewUser();    
                break;
        
            default: System.out.println("Error!");
             }
        } while (num !=0); 
    }
    private static void Login(){
        System.out.println("Enter phone number:");
        String phoneNumber=es.next();
        System.out.println("Enter Email address:");
        String email=es.next();
        int n=databace.login(phoneNumber, email);
        if(n !=-1){
            User user=databace.getUser();
            System.out.println("Welcome "+ user.getName());
        }else{
           System.out.println("User doesn't exist!");
        }
    
    }
    private static void NewUser(){
        System.out.println("Enter Name:");
        String name=es.next();
        System.out.println("Enter Phone number:");
         String phoneNumber=es.next();
        System.out.println("Enter email:");
        String email=es.next();
        System.out.println("1.Admin\n2.Normal User");
        int n2=es.nextInt();

        if(n2==1){
            User admin= new Admin(name, phoneNumber, email);
            databace.AddUser(admin);
        }else{
            User user= new NormalUser(name, phoneNumber, email);
            databace.AddUser(user);
        }
        user.manu();

    }
    
}
