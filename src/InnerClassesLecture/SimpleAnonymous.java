package InnerClassesLecture;

abstract class AnonymousInner {
	   public abstract void mymethod();
}

interface AnonymousInner1{
	abstract void mymethod();
}

	public class SimpleAnonymous {

	   public static void main(String args[]) {
		   
	      AnonymousInner inner = new AnonymousInner() {
	         public void mymethod() {
	            System.out.println("This is an example of anonymous inner class created using abstract class");
	         }
	      };
	      
	      AnonymousInner1 inner1 = new AnonymousInner1() {
		         public void mymethod() {
		            System.out.println("This is an example of anonymous inner class created using interface");
		         }
		     };
	      
	      inner.mymethod();	
	      inner1.mymethod();
	   }
	}


