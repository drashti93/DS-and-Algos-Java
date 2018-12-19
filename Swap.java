import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers to be swapped");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		mySwapFunction(num1,num2);
		System.out.println("Swapped numbers are: "+num1+" "+num2);
	}
		public static int mySwapFunction (int n1, int n2) {
			int temp = n1;
			n1=n2;
			n2=temp;
			return n1;
		}

	}


