package student;
import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		int n;
		int fact=1;
		System.out.println("Enter the number");
		Scanner input= new Scanner(System.in);
		n= input.nextInt();
		input.close();
		for(int i=1; i<=n; i++) {
			fact=fact*i;
		}
		if(n>=70) {
			System.out.println("Math Error");
		}
		System.out.println("factorial :"+fact);
	}
		

	}


