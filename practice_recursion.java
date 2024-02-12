public class practice_recursion {
    static int factorial(int n){
        if (n==0 || n==1) {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    } 

    public static void main(String[] args) {
        int x=7;
        // int z=x*factorial(x-1);
        // z=factorial(x);
        System.out.println(factorial(x));

    }
}
