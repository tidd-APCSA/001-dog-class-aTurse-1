public class Main {
  public static void main(String[] args) {
    // test your code here by creating a three different dogs from the Dog class. Be sure you give each dog different characteristics. 
   System.out.println("Running...");
 
 Dog happy = new Dog("Happy", "Bermese Mountain Dog", 120,"Brown", false);

 Dog fluffy = new Dog("Fluffy", "Shitzu", 13, "White", true);

 Dog dopey = new Dog("Dopey", "Beagel", 25, "Black and Brown", true);

 System.out.println(happy.toString());
 System.out.println(fluffy.toString());
 System.out.println(dopey.toString());

  }
}