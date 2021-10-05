import java.util.Scanner;

public class multiplicationTable {

    static void multipyTable (int x) {
        int mul;
        for (int i=1; i <= 12; i++) {
            mul = x * i;
            System.out.printf ("%d  x %d = %d\n", x, i, mul);
        }

    }

    public static void main(String[] args){
        Scanner keybd = new Scanner(System.in);
        int value;
        String answer = "y";

        while (answer.equalsIgnoreCase("y")) {
            System.out.print("Enter a number: ");
            value = keybd.nextInt();

            multipyTable(value);

            System.out.print("Do you want to continue? (y/n)?");
            answer = keybd.next();
        }
        System.out.println("Bye!");
    }
}
