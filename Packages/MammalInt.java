package animals;
/* File name : MammalInt.java */

public class MammalInt implements Animal {

   public void eat() {
      System.out.println("Mammal eats");
   }

   public void travel() {
      System.out.println("Mammal travels");
   } 

   public int noOfLegs() {
      return 0;
   }

   public static void main(String args[]) {
      MammalInt m=new MammalInt();
      m.eat();
      m.travel();
   }
} 

/*To compile the Java programs with package statements, you have to use -d option as shown below.

javac -d Destination_folder file_name.java

javac -d . Animal.java

javac -d . MammalInt.java
*/

/* To Execute
java newly created package.Main class

java animals.MammalInt

*/