public class try_catch{
    public static void main(String[] args) {
        int a=6000;
        int b= 0;
        int c=a/b;
    try{
        //prints 6000 because it doesn't throw an exception
        System.out.println(c);
    }
    catch(Exception e){
        System.out.println(e);
    }
}
}