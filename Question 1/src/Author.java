
/**
 *
 * @author Clayton
 */


public class Author

{

     protected String name;

     protected String email;

     protected char gender;


     public Author(String name, String email, char gender)

     {

          this.name = name;

          this.email = email;

          this.gender = gender;

     }


     public String getName()

     {

          return name;

     }


     public String getEmail()

     {

          return email;

     }


     public char getGener()

     {

          return gender;

     }



     public void setEmail(String email)

     {

          this.email = email;

     }

     public String toString()

     {

          return ( name + "(" + gender + ") at " + email);

     }
public static void main(String[] args){
    
    Author washington = new Author ("Nicki Washington", 
            "washingtonn@winthrop.edu", 'f');
    
    System.out.println(washington.toString());
    
}
}