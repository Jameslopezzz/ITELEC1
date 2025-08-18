import java.util.Scanner;

public class ArithmeticProcess {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		//If else statements
		if (num % 2 != 0) {
			System.out.println("Number " + num + " is odd");
		}
		else {
			System.out.println("Number " + num + " is even");
		}
		
	//Arithmetic Process	
	int sum = num + 5;
	int diff = num - 2;
	int prod = num * 10;
	float quot = (num/5f);
	
	System.out.println(num + " + 5 is: " + sum);
	System.out.println(num +" - 2 is: " + diff);
	System.out.println(num +" * 10 is: " + prod);
	System.out.println(num + " / 5 is: " + quot);
	}
}
