package InnerClassesLecture;

public class LocalInnerClass {
	  
	
	   void my_Method() {
	      int num = 23;
	      class MethodInner_Demo {
	         public void print() {
	            System.out.println("This is method inner class "+num);	   
	         }   
	      } 
		   
	      MethodInner_Demo inner = new MethodInner_Demo();
	      inner.print();
	   }
	   
	   public static void main(String args[]) {
		   LocalInnerClass outer = new LocalInnerClass();
	      outer.my_Method();	   	   
	   }
	}

