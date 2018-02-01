import java.util.Scanner;
public class testing {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int numSquare = 0;

    System.out.print("Enter a number and I will square it for you: ");
    int num = input.nextInt();
    numSquare = num * num;

    System.out.println(numSquare);

    if (numSquare <= 50) {
      System.out.print("That is a small number");
    } else {
      System.out.println("That is a big number");
    }

  }


}
