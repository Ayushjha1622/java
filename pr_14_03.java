import java.util.Scanner;

public class pr_14_03 {
    public static void main(String[] args) {
        boolean flag = true;
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int index;
        while (flag && i < 5) {
            try {
                System.out.println("enter the value of index");
                index = sc.nextInt();
                System.out.println("the value of marks[index] is" + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("invalid index");
                i++;
            }
        }
        if (i <= 5) {
            System.out.println("error");
        }
    }

}
