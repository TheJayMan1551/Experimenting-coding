import java.util.Scanner;
public class testing {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numSquare = 0;

		System.out.print("Enter a number and I will square it for you: ");
		int num = input.nextInt();
		numSquare = num * num;

		System.out.println(numSquare);

		System.out.println("Would you like to see the results?(1 for yes)");
		int answer = input.nextInt();

		if (answer == 1) {
			if (numSquare <= 50) {
				System.out.print("That is a small number");
			} else {
				System.out.println("That is a big number");
			}
		}
		System.out.println();
		System.out.print("Goodbye to you all and have a nice day! :)");
	}


}
