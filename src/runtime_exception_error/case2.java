package runtime_exception_error;

import java.util.Scanner;

public class case2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Get the square root of? (Insert number please)");
        int input = Integer.parseInt(scanner.nextLine());
        if (input < 0) {
            System.out.println("The number must be bigger than zero");
        } else {
            double square_root = Math.sqrt(input);
            System.out.println("The square root of " + input + " is " + square_root);
        }
    }
}
