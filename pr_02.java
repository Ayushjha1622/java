import java.util.Scanner;

public class pr_02 {
    public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your marks in physics");
        m1 = sc.nextByte();

        System.out.println("enter your marks in chemistry");
        m2 = sc.nextByte();

        System.out.println("enter your marks in mathematics");
        m3 = sc.nextByte();

        float avg = (m1+m2+m3)/3.0f;
        if (avg>=40 && m1>=33 && m2>=33 && m3>=33) {
            System.out.println("congratulations, u have been promoted");
        }
        else{
            System.out.println("sorry, u r not eligible for promotion");
        }


        
    }
}
