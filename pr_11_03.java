class monkey{
    void jump(){
        System.out.println("jumping");
    }
    void bite(){
        System.out.println("biting");
    }
}

interface basic_animal_interface{
    void eat();
    void sleep();
}


class humanclass extends monkey implements basic_animal_interface{
    void speak(){
        System.out.println("hello sir");

    }

    public void sleep(){
        System.out.println("sleeping");

    }
    public void eat(){
        System.out.println("eating");

    }


}


public class pr_11_03 {
    public static void main(String[] args) {
        humanclass harry = new humanclass();
        harry.sleep();
    }
}
