public class pr_07_08 {
    static void pattern1_rev(int n) {
        if (n>0) {
            pattern1_rev(n-1);

            for (int i = 0; i < n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern1_rev(4);
    }
}
