import java.io.File;
import java.io.*;
import java.util.*;

public class pr_delete {
    public static void main(String[] args) {

        File xyz = new File("abcd.txt");
        if (xyz.delete()) {
            System.out.println(xyz.getName());
        } else {
            System.out.println("file not found");
        }
    }
}
