package runtime_exception_error;

import java.util.Scanner;

public class case1 {
    public static void main(String[] args) {
        int[] sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Password?");
        String read = scanner.nextLine();
        if (read.equals("password"))
            sum = new int[2];
        else
            sum = new int[3];
        sum[1] = 10;
        sum[2] = 23;
        int erg = sum[1] + sum[2];
        System.out.println(sum[1] + " + " + sum[2] + " = " + erg);
    }
}
