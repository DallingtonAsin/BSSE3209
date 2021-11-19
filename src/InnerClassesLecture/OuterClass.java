package innerClassesLecture;


abstract class AnonymousInnerW{
	abstract void getMyName();
}

interface AnonymousInnerI{
	public abstract int getMyAge(int age);
	public abstract void print();
}


public class OuterClass {
	private String outer_class = "OuterClass"; // private instance variable
	
	private int getAge() {
		return 10;
	}
	
	private static int getAge1() {
		return 10;
	}
	
	void calculateInterest(double principal, double time) {
		// local inner class
		
		   class InterestCalculator{
			   final double rate = 0.75;
			    double returnValue() {
			    	return principal*rate*time*0.01;
			    }
		   }
		   InterestCalculator ic = new InterestCalculator();
		   double si = ic.returnValue();
		   
		System.out.println("The total interest for amount "+principal+" after "+time+" years is "+si);
		
	}
	
	// member inner class
	 class InnerClass{ 
		 private String name = "InnerClass"; // private instance variable within an inner class
	   	 private void message() {
	   		  System.out.println("I am an inner class within outer class called "+outer_class+" who is "+getAge()+" years old");
	   	 }
	}
	 
	 // static member inner class
	 static class StaticInnerClass{
		 private static int num = 12;
		  void print() {
			 System.out.println("I am static inner class within outer class");  
		  }
		  
		  private int returnValue() {
			  return new OuterClass().getAge1();
		  }
		  
		  private static int returnNum() {
			  return num;
		  }
		  
		  
		  
		  
	 }
	 
	
	public static void main(String[] args) {
		
		// instantiating non-static inner class
     OuterClass o = new OuterClass();
     
     OuterClass.InnerClass inner = o.new InnerClass();
     
     System.out.println("Me, outer class has inner class named "+inner.name);
     inner.message();
     
     // instantiating static inner class
     OuterClass.StaticInnerClass inner1 = new OuterClass.StaticInnerClass();
     inner1.print();
     inner1.returnValue(); 
     
     // creating anonymous class using abstract class
     AnonymousInnerW i = new AnonymousInnerW(){
    	 void getMyName() {
    		System.out.println("I am anonymous class created using abstract class");
    	 }
     };
     
     i.getMyName();
     
     // creating anonymous class using interface
     AnonymousInnerI k = new AnonymousInnerI() {
    	 public int getMyAge(int age) {
    		 return age;
    	 }
    	 public void print() {
    		 System.out.println("I am anonymous class created using interface"); 
    	 }
     };
     
     int age = 50;
     System.out.println("The age number is "+k.getMyAge(age));
     k.print();
     
     // Making use of method that contains local inner class
     
     
     o.calculateInterest(5000000, 4);
     
     
     
     
     

	}

}
