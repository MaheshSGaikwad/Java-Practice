import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int num;
		num=sc.nextInt();
		if(num%2==0)
			System.out.println("even number");
		else
			System.out.println("odd number");

	}
}
