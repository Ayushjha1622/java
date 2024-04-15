import java.util.Scanner;

class MyException extends Exception {

    public String toString() {
        return super.toString() + "I am toString";
    }

    public String getMessage() {
        return super.getMessage() + " I am getMessage()";
    }
}

public class exception_class {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a < 99) {

            try {

                throw new ArithmeticException("this is an exception");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                e.printStackTrace();
                System.out.println("yes finished");
            }
        }
    }
}
