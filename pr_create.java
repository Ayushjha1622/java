import java.io.File;
import java.io.*;
import java.util.*;

public class pr_create {
    public static void main(String[] args) {

        File xyz = new File("abcd.txt");
        try {
            xyz.createNewFile();
        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}
