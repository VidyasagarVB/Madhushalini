package KRNifomatix;

public class Constructor {

	public static void main(String[] args) {
		//Constructor is like a class no need to call
		System.out.println("This is Begining");
		eight l8 = new eight();
		l8.eastgodavari();
		eight.Rajmundri();

	}
}
class eight{
	eight(){
		System.out.println("This is called by no obj");
	}
	public void eastgodavari() {
		System.out.println("Godawari");
		
	}
	public static void Rajmundri() {
		System.out.println("Rajmandri");
	}
}