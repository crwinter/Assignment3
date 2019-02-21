
/**
 *
 * @author Clayton
 */
public class Book {
    



     private String name;

     private Author author;

     private double price;

     private int qtyInStock = 0;


     public Book(String name, Author author, double price, int qtyInStock)

     {

          this.name = name;

          this.author = author;

          this.price = price;

          this.qtyInStock = qtyInStock;

     }


     public String getName()

     {

          return name;

     }


     public Author getAuthor()

     {

          return author;

     }


     public double getPrice()

     {

          return price;

     }


     public int getQtyInStock()

     {

          return qtyInStock;

     }


     public void setPrice(double price)

     {

          this.price = price;

     }

     public void setQtyInStock(int qtyInStock)

     {

          this.qtyInStock = qtyInStock;

     }


     public String toString()

     {

          return (name + " by "+author);
     }
     
     public static void main(String[] args){
         Author Washington = new Author ("Nik", "wonn@wop.edu", ’f’); Book toc 
                 = new Book ("Stay Prepped: 10 Steps to Succeeding in College"
                 + " (and Having a Ball Doing It)!", Washington,
                 14.95, 1908);
     }
}
