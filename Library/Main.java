package users;
import java.util.*;

public class Main {
    static Scanner es;
    public static void main(String[] args) {
        Databace databace =new Databace();
        System.out.println("Welcome to Library Management System: \n"+ "1. Login\n 2.New User");
        es=new Scanner(System.in);
        int n=es.nextInt();

        switch (n) {
            case 1:Login();
            case 2:NewUser();    
                break;
        
            default: System.out.println("Error!");
        }
    }

    private static void Login(){
        System.out.println("Enter phone number:");
        String phoneNumber=es.next();
        System.out.println("Enter Email address:");
        String email=es.next();
    }
    private static void NewUser(){
        System.out.println("Enter Name:");
        String name=es.next();
        System.out.println("Enter Phone number:");
         String phoneNumber=es.next();
        System.out.println("Enter email:");
        String email=es.next();
        System.out.println("1.Admin\n 2.Normal User");

        int n2=es.nextInt();
        if(n2==1){
            User admin= new Admin(name, phoneNumber, email);
        }else{
            User user= new User(name, phoneNumber, email);
        }

    }
    
}
