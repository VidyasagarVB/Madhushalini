
public class methodoverriding {

	public static void main(String[] args) {
	//two t2= new two();
	//t2.Run();
//	t2.Run1();
		
		four f4= new four();
		f4.poly(10, 20);
		f4.poly(10, 20, 30);
	}

}
class one{
	public void Run(){
		System.out.println("BMW");
	}

}
class two extends one{
	public void Run() {
		System.out.println("AUDI");
	}
}
class three extends two{
	public void Run(){
		System.out.println("MAHINDRA");	
	}
}
class four{
	public void poly(int a, int b) {
		System.out.println(a + b);
	}
	public void poly(int a, int b, int c) {
		System.out.println(a + b + c);
	}
}
