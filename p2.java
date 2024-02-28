class Cylinder{
    private int r,h;

    Cylinder(int r, int h){
        this.r=r;
        this.h=h;
    }

    public double Area(){
        return 2*Math.PI*r*r + 2*3.142*r*h;
    }
    public double volume(){
        return Math.PI*r*r*h;
    }

    public int getR(){
        return r;
    }
    public void setH(int h){
        this.h=h;
    }
    public int getH(){
        return h;
    }
    public void setR(int r){
        this.r=r;
    }
    
}
public class p2 {
    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder(4,5);
        System.out.println(myCylinder.Area());  
        System.out.println(myCylinder.volume());
    }
    
}
