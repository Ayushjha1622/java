import java.util.Scanner;

public class taking_input {
    public static void main(String[] args) {
        // Taking input from the user using Scanner Class in Java.
        System.out.println("taking input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of these numbers is");
        System.out.println(sum);

    }
}
