import java.util.Scanner;

public class FACRTORIAL {

	public static void main(String[] args) {
	
		
		int y=1;
		
		int sum=1;
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the factorial value");
		
		
		int x=sc.nextInt();
		
		while(y<=x) {
			
			sum=sum*y;
			
			y++;
				
		}
		System.out.println(sum);
	}

}
