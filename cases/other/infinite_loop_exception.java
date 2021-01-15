package other_runtime_exception_errors;

public class infinite_loop_exception {
    public static void main(String[] args) {
        for (int f = 0; f >= 0; f++) {
            System.out.println("Party!! Nr. " + f);
        }
    }
}
