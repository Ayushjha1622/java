interface bicycle{

    int a =45;
    void applybrake(int decrement);
    void speedup(int increment);
}

interface horncycle{

    int b =45;
    void blowhorn();
    void bloghorn();
}

class avon implements bicycle,horncycle{

    void blowhorn1(){
        System.out.println("pee pee pee ");
    }
        public void applybrake(int decrement){
        System.out.println("applying brake");
    }

        public void speedup(int increment){
        System.out.println("applying speedup");
    }

        public void blowhorn(){
        System.out.println("kabhi khushi kabhi gum");
    }

        public void bloghorn(){
        System.out.println("main hoon na");
    }
}


public class interfaces {
    public static void main(String args[]) {
        avon cycle = new avon();
        
        cycle.applybrake(1);
        // u can create properties in interfaces

        System.out.println(cycle.a);
        // u cannot modify properties in interfaces as they are final
        cycle.bloghorn();
        cycle.blowhorn();

    }
}
