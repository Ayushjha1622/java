abstract class pen{
    abstract void write();
    abstract void refill();
}

class fountain_pen extends pen{
    void write(){
        System.out.println("Fountain Pen is writing.");
    }

    void refill(){
        System.out.println("refilling");
    }

    void change_nip(){
        System.out.println("changing the nip");
    }
}
public class pr_11_01 {
    public static void main(String[] args) {
        fountain_pen pen = new fountain_pen();
        pen.change_nip();
    }
}
