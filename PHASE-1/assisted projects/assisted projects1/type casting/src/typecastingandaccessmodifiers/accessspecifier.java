package typecastingandaccessmodifiers;

public class accessspecifier {
 public void display()
 {
	 System.out.println(" access to protected method ");
	 
 }
 public void test()
 {
	 System.out.println(" access to private method");
	 
 }
 public void hai()
 {
	 System.out.println(" access to public method");
	 
 }
 public void world ()
 {
	 System.out.println(" access to default method");
	 
 }
 public static void main(String[] args) {
	 accessspecifier obj=new accessspecifier();
	 obj.display();
	 obj.test();
	 obj.hai();
	 obj.world();
 }
}
