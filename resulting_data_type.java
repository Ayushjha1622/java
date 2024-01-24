public class resulting_data_type {
    public static void main(String[] args) {
        byte x = 5;
        int y = 6;
        short z = 8;
        int a = y + z;
        float b = 6.54f + x;
        System.out.println(b);
        System.out.println(a);

        // increment and decrement operators
        int i=56;
        System.out.println(i++);  // first b is assigned i (56) then i is incremented
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
    }
}
