abstract class MyClass{
   public void disp(){
     System.out.println("Concrete method of parent class");
   }
   abstract public void disp2();
}

class Demo extends MyClass{
   public void disp2()
   {
       System.out.println("Overriding abstract method");
   }   
}

class AbstractClass {
  public static void main(String args[]){
       Demo obj = new Demo();
       obj.disp();
       obj.disp2();
   }
}