class ekClass {
    int a;

    ekClass(int v) {
        this.a = v;
    }

    public int getA() {
        return a;
    }

    public int returnOne() {
        return 1;
    }
}

class DoClass extends ekClass{
    DoClass(int c){
    super(c);
        System.out.println("this is an constructor: ");
    }
}

public class keywords {
    public static void main(String[] args) {
        ekClass e = new ekClass(5);
        System.out.println(e.getA());
        DoClass d = new DoClass(7);
        System.out.println(e.getA());
    }
}
