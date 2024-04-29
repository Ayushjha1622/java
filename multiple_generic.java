class test<T,U>{
    T obj1;
    U obj2;

    test(T obj1, U obj2){
        this.obj1=obj1;
        this.obj2=obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
public class multiple_generic {
    public static void main(String[] args) {
        test <Integer, String> in = new test<Integer, String>(1,"obj");
        in.print();

        
    }
}
