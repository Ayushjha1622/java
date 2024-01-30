import java.util.Scanner;

public class pr_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your income in lakhs per annum");
        float income = sc.nextFloat();
        float tax = 0;
        if (income<+2.5) {
            tax = tax + 0;
        }
        else if(income>2.5f && income<=5f){
            tax = tax + 0.05f*(income-2.5f);
        }
        else if(income>5f && income<=10f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.05f*(income-2.5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f*(5.0f-2.5f);
            tax = tax + 0.2f*(10.0f-5f);
            tax = tax + 0.3f*(income-10f);
        }

        System.out.println("the total tax paid by the employee is: " + tax);
    }
}
