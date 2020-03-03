import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {

		double val1 = 100;
		double val2 = 50;
		double result;
		int opCode = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Press(1) for addition");
		System.out.println("Press(2) for substraction");
		System.out.println("Press(3) for division");
		System.out.println("Press(4) for multiplication");
		System.out.println("Enter the  integer value to do the calculation");
		opCode = scan.nextInt();

		if (opCode == 1) {
			result = val1 + val2;
		} 
		else if (opCode == 2) {
			result = val1 - val2;
		} 
		else if (opCode == 3){
			result = val1 / val2;
		}

		else if (opCode == 4) {
			result = val1 * val2;
		} 
		
		else {

			result = 0.0d;
		}

		System.out.println(result);

	}

}
