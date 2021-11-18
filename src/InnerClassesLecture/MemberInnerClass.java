package InnerClassesLecture;

class MemberInnerClass{
    static String parent_name ="X";
    class Y {
      void message(){
       System.out.println("Hey, I am an non-static inner class Y and my parent class is "+parent_name);
    } 
   }

public static void main(String[] args)  
     {  
	MemberInnerClass x = new MemberInnerClass();
	MemberInnerClass.Y innerObj = x.new Y();
       innerObj.message();  
     }
}
