package KRNifomatix;

public class ReturnedKeyword {

	public static void main(String[] args) {
		System.out.println("This is Begining");
		seven l7= new seven();
		
		int e=l7.add(678, 780);
		System.out.println(e);
		
		int f= l7.add(87, 90);
		System.out.println(f);
		
		int g=l7.multiplication(789, 89);
		System.out.println(g);
		
		l7.pune();
				
	}

}
class seven{
	public int add(int a, int b) {
		int c=a+b;
		return c;
	}
	public void pune() {
		System.out.println("This is pune");
	}
	public int multiplication(int a, int b) {
		int d=a*b;
		return d;
	}
}