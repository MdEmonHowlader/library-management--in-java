package Library;

// import java.util.*;

public class Book {
    private String name;
    private String author;
    private String publisher;
    private String adress;
    private String status;
    private int  qry;
    private double price;
    private int brwcopies;

    public Book(){};

    public Book(String name, String author, String publisher, String adress, String status, int qry, double price, int brwcopies){
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.adress=adress;
        this.status=status;
        this.qry=qry;
        this.price=price;
        this.brwcopies=brwcopies;
    }
    @Override
    public String toString(){
       String text="Book name: "+ name+
       "Book Author: "+ author+
       "Book Publisher: "+ publisher+
       "Book Collection Address: "+ adress+
       "QTY: "+ String.valueOf(qry)+
       "Price: " + String.valueOf(price)+
       "Brwcopies: "+String.valueOf(brwcopies);
       return text;
        }
        public String getNmae(){
            return name;
        }
        public void setName(String name){
            this.name=name;
        }
        public String getAuthor(){
            return author;
        }
        public void setAuthor(String author){
            this.author=author;
        }
        public String getPublisher(){
            return publisher;
        }

        public void setPublisher(String publisher){
            this.publisher=publisher;
        }

        public String getAdress(){
            return adress;
        }
        public void setAdress(String adress){
            this.adress=adress;
        }

        public String getStatus(){
            return status;
        }
        public void setStatus(String status){
            this.status=status;
        }

        public int getQry(){
            return qry;
        }

        public void setQry(int qry){
            this.qry=qry;
        }

        public int getBrwcopies(){
            return brwcopies;
        }
        public void setBrwcopies(int brwcopies){
            this.brwcopies=brwcopies;
        }

}
