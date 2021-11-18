package lecture;

class StaticInnerClass{
	  static String parent_name = "A";
	  static class B{
	    void whoami(){
	      System.out.print("I am a static inner class Band my parent class is "+parent_name);
	     }
	  }
	 public static void main(String[] args)  
	      {  
		 StaticInnerClass.B obj = new StaticInnerClass.B();  
	        obj.whoami();  
	      }
	}
