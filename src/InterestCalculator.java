import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        int month;
        double money;
        double interestMonth;
        double interestTotal = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your money: ");
        money = scanner.nextDouble();

        System.out.println("Input your month: ");
        month = scanner.nextInt();

        System.out.println("Input your interestMonth: ");
        interestMonth = scanner.nextDouble();

        for (int i = 0; i < month; i++) {
            interestTotal += money * (interestMonth/100)/12 * month;
        }

        System.out.println("You have: " + interestTotal + " after " +month+ " month");
    }
}
