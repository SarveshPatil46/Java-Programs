//save by B.java  
package mypack;  
import pack.A;  // OR import pack.*;//
  
class B{  
  public static void main(String args[]){  
   A obj=new A();  
   obj.msg();  
  }  
}  

/*To compile the Java programs with package statements, you have to use -d option as shown below.

javac -d Destination_folder file_name.java

javac -d . A.java

javac -d . B.java
*/

/* To Execute
java newly created package.Main class

java mypack.B
*/
