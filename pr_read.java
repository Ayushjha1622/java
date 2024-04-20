import java.io.File;
import java.io.*;
import java.util.*;

public class pr_read {
    public static void main(String[] args) {
        File xyz = new File("abcd.txt");
        try {
            Scanner sc = new Scanner(xyz);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);

            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
