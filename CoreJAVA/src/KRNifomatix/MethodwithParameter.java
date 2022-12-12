package KRNifomatix;

public class MethodwithParameter {

	public static void main(String[] args) {
		System.out.println("This is begining");
		three l3 = new three();
		l3.add(250, 400);
		four l4 = new four();
		l4.Naruto();
		l4.Hasira();
		
	}

}
class three{
	public void add(int a, int b) {
		int c =a+b;
		System.out.println(c);
		
	}
}
	class four {
		public void Naruto() {
			System.out.println("Uzumaki naruto");
		}
			
			public void Hasira() {
				System.out.println("Hashirama");
			}
		}
	
