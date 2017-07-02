package assignments;

class A1{
	   
    A1(){
        System.out.println("A's no argument constructor");
    }
   
    A1(String args){
        System.out.println("A's one argument constructor");
    }
}
 
class B extends A1{
   
   B(){
        this(""); // calling one arg constructor of class B
        System.out.println("B's no argument constructor");
    }
  
   B(String args){
        super(""); // calling one argument constructor of class A
        System.out.println("B's one argument constructor");
    }
}
 
// Test Class and Output 
public class SuperAndThis {
   
    public static void main(String args[]) {      
       B b = new B();             
    }
 
}



