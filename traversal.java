public class traversal{
    public static void main(String[] args) {
        // float [] marks = {98.5f, 45.5f, 79.5f, 99.5f, 80.5f};
        // String [] students = {"harry", "rohan", "shubham", "lovish"};
        // System.out.println(marks[2]); 
        // System.out.println(students.length);
        
        
        int[] marks = {98, 45, 79, 99, 80};
        // System.out.println(marks.length); 
//      displaying the array (naive way)
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // System.out.println(marks[3]);
        // System.out.println(marks[4]);

        // displaying the array (for loop)
        // System.out.println("printing using for loop");
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.println(marks[i]);
        // }
        // for (int i = marks.length -1; i >= 0; i--) {
        //     System.out.println(marks[i]);
        // }
        for(int element: marks){
            System.out.println(element);
        }

    }
}