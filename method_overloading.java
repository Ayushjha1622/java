public class method_overloading {
    static void foo(){
        System.out.println("good morning");

    }
    static void foo(int a){
        System.out.println("good morning " + a + " bro");

    }
    static void foo(int a,int b){
        System.out.println("good morning " + a + " bro");
        System.out.println("good morning " + b + " bro");

    }

    // static void change(int a){
    //     a=98;
    //     System.out.println("I invented a new word!\n" + "plagiarism");
    // }
    // static void change2(int [] arr){
    //     arr[0]=98;
    //     System.out.println("I invented a new word!\n" + "plagiarism");
    // }
    public static void main(String[] args) {
        // tellJoke();
        // changing the integer
        //     int x =45;
        //     change(x);
        //     System.out.println("the value of x after running change is: " + x);
        
        // changing the array
        
        // int [] marks = {45,78,89,76,79};
        // change2(marks);
        // System.out.println("the value of marks after running change is: " + marks[0]);
        foo();
        foo(3000);
        foo(4000,6000); // arguments are actual while a and b are parameter
     }
    
}
