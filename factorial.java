class fact{
    int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
}
public class factorial {
    public static void main(String[] args) {
        fact obj = new fact();
        int n=5;
        System.out.println(obj.fact(n));
    }
}
