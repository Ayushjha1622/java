import java.io.File;
import java.util.*;
import java.io.*;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        // code to create a new file

        // File MyFile = new File("cwg1111file.txt");
        // try {
        // MyFile.createNewFile();
        // } catch (IOException e) {
        // System.out.println("An error occured");
        // e.printStackTrace();
        // }

        // code to type in file

        // try {
        // FileWriter fileWriter = new FileWriter("cwg1111file.txt");
        // fileWriter.write("this is our first file");
        // fileWriter.close();
        // } catch (IOException e) {
        // e.printStackTrace();

        // }

        // reading a file

        // File myFile = new File("this.txt");
        // try {
        // Scanner sc = new Scanner(myFile);
        // while (sc.hasNextLine()) {
        // String line = sc.nextLine();
        // System.out.println(line);

        // }
        // sc.close();
        // } catch (FileNotFoundException e) {
        // e.printStackTrace();
        // }

        // code to delete a file
        File myFile = new File("cwg1111file.txt");
        if (myFile.delete()) {
            System.out.println(myFile.getName());
        } else {
            System.out.println("file not found");
        }

    }
}
