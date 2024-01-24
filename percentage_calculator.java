import java.util.Scanner;

public class percentage_calculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your physics marks");
        int physics = scan.nextInt();

      
        System.out.println("enter your english marks");
        int english = scan.nextInt();

       
        System.out.println("enter your maths marks");
        int maths = scan.nextInt();

       
        System.out.println("enter your science marks");
        int science = scan.nextInt();

        
        System.out.println("enter your arts marks");
        int arts = scan.nextInt();

        float percentage = ((physics+english+maths+science+arts)/500.0f)*100;
        System.out.println("percentage : ");
        System.out.println(percentage);
    }
}
