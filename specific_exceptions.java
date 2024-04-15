import java.util.Scanner;

public class specific_exceptions {
    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 54;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the array index");
        int index = sc.nextInt();

        System.out.println("enter the num u want  to divide with");
        int num = sc.nextInt();

        try {
            System.out.println("the value at array index entered is: " + marks[index]);
            System.out.println("the value of array-value/number is: " + marks[index] / num);
        }

        catch (ArithmeticException e) {
            System.out.println(e);
            System.out.println("Arithmeticexception will occur");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
            System.out.println("ArrayIndexOutOfBoundsException will occur");
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("some other exception will occur");
        }

    }
}