interface camera {
    void takesnap();

    void recordvideo();
    private void greet(){
        System.out.println("good morning");
    }

    default void record4kvideo() {
        greet();
        System.out.println("recording in 4k...");
    }

}



interface wifi {
    String[] getnetworks();

    void connecttonetwork(String network);
}



class cellphone {
    void callnumber(int phonenumber) {
        System.out.println("calling" + phonenumber);
    }

    void pickcall() {
        System.out.println("connecting...");
    }
}



class mysmartphone extends cellphone implements wifi, camera {
    public void takesnap() {
        System.out.println("take snap");

    }

    public void recordvideo() {
        System.out.println("taking video");

    }

    public String[] getnetworks() {
        System.out.println("getting list of networks");
        String[] networklist = { "ayush", "prashanth", "anjali" };
        return networklist;
    }

    public void connecttonetwork(String network) {
        System.out.println("connecting to " + network);
    }
}



public class polymorphism {
    public static void main(String[] args) {
        camera cam1 = new mysmartphone();  // use it as a camera
        // cam1.getnetworks();
        cam1.record4kvideo();
        
        mysmartphone s = new mysmartphone();
        s.getnetworks();
        s.callnumber(789);
        s.recordvideo();
    }
}

