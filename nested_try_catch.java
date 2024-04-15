public class nested_try_catch {

    public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 7;
        marks[1] = 54;
        marks[2] = 6;

        try {
            System.out.println("welcome to video 82");
            try {
                System.out.println(marks[9]);

            }

            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("sorry this index does not exist");
                System.out.println("error at level 2");
                System.out.println("ArrayIndexOutOfBoundsException will occur");

            }
        } catch (Exception e) {
        System.out.println("exception in level 1");
        
        }
    }
}
