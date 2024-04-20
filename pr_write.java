import java.io.File;
import java.io.*;
import java.util.*;

public class pr_write {
    public static void main(String[] args) {
        try {
            FileWriter xyz = new FileWriter("abcd.txt");
            xyz.write("Ayush is awesome");
            xyz.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
