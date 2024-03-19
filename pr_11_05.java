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


public class pr_11_05 {
    public static void main(String[] args) {
        humanclass harry = new humanclass();
        harry.sleep();

        monkey m1 = new humanclass();
        m1.jump();
        m1.bite();
        // m1.speak();  // cannot speak method because the refence is monkey which does not  speak method

        basic_animal_interface lovish = new humanclass();
        lovish.sleep();
        lovish.eat();

    }
}
