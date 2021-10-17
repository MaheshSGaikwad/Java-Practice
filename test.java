import java.util.Scanner;

public class NumCheck {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n;
		n=sc.nextInt();
		if(n%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");

	}
}
