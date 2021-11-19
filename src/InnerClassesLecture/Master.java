package innerClassesLecture;

abstract class AnonymousInnerA{
	abstract void print();
}

interface AnonymousInnerB{
	abstract void print();
}

public class Master {
	private String parent = "Master";
	

	private int getAge() {
		return 20;
	}

	// Member inner class
	class innerman1{
		private int years = 12;
		private void message() {
			System.out.println("I am non-static inner class with in outer class "+parent+" who is "+getAge()+" years old");
		}
	}

    // Static inner class
	static class innerman{
		private void message() {
			System.out.println("I am static inner class within outer class "+new Master().parent);
		}
	}

	
	void printInterest(double principal, int time) {
		// local inner class
		class InterestCalculator{
			private final double rate = 0.5; // constant
			public double getInterest() {
				return principal*rate*time*0.01;
			}
		}
		InterestCalculator ic = new InterestCalculator();
		double i = ic.getInterest();
		System.out.println("The total interest after "+time+" years for amount "+principal+" is "+i);
	}

	public static void main(String[] args) {

		Master kk = new Master();

		// Creating an instance for non-static inner class
		Master.innerman1 i = kk.new innerman1();
		i.message();


		System.out.println("Non-static inner class innerman is "+i.years+" years old");


		// Creating an instance for static inner class
		Master.innerman p = new Master.innerman();
		p.message();


		// Anonymous inner class created using abstract class
		AnonymousInnerA inner = new AnonymousInnerA(){
			public void print() {
				System.out.println("I am anomymous inner class created from abstract class");
			}
		};

		// Anonymous inner class created using interface
		AnonymousInnerB inner1 = new AnonymousInnerB(){
			public void print() {
				System.out.println("I am anomymous inner class created from interface class");
			}
		};

		inner.print();
		inner1.print();

		kk.printInterest(30000, 4);

	}

}
