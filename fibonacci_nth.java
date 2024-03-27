class fibonacci{
    static int fib(int n){ 
    int a=0,b=1,c;
    if(n==0)
    return a;

    for (int i = 2; i <= n; i++) {
        c=a+b;
        a=b;
        b=c;
    }
    return b;

    }
}
class fibonacci_nth{
    public static void main(String[] args) {
        int n=6;
        System.out.println(fibonacci.fib(n));
    }
}