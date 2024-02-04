public class pr_07_03 {
    static int SumRec(int n){
        if (n==1) {
            return 1;
        }
        else{
            return n + SumRec(n-1);
        }
    }
    public static void main(String[] args) {
       int c =  SumRec(10);
        System.out.println(c);
    }
}
