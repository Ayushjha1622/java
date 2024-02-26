import java.util.*;
class Cylinder{
    private int radius;
    private int height;

    public int getRadius(){
        return radius;
    }

    public void setRadius(int radius){
        this.radius=radius;
    }

    public int getHeight(){
        return height;

    }

    public void setHeight(int height){
        this.height = height;
    }  
}


public class pr_09_01 {

    public static void main(String[] args) {
        Cylinder myCylinder = new Cylinder();

        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());

        myCylinder.setRadius(15);
        System.out.println(myCylinder.getRadius());


        
    }
}
