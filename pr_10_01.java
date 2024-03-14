class circle{
    public int radius;
    circle(){
        System.out.println("i am not param of circle");
    }
    circle(int r){
        System.out.println("i am circle parameterized constructor");
        this.radius = r;
    }
   
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle{
    public int height;
    cylinder1(int r, int h){
        super(r);
        System.out.println("i am cylinder1  parameterized constructor");
        this.height=h;
    }
   
    public double volume(){
        return  Math.PI*this.radius*this.radius*this.height;
    }
    
}
public class pr_10_01 {
    public static void main(String[] args) {
        // circle objc = new circle(12);
        cylinder1 obj = new cylinder1(5,6);
    }
}
