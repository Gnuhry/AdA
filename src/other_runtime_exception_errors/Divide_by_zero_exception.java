package other_runtime_exception_errors;

import java.util.Scanner;

public class Divide_by_zero_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Divide\nNumber1?");
        try {
            int x = Integer.parseInt(scanner.nextLine());
            System.out.println("Number2?");
            int y = Integer.parseInt(scanner.nextLine());
            System.out.println(x + " / " + y + " = " + (x / y));
        } catch (NumberFormatException ignored) {
        }
    }
}
