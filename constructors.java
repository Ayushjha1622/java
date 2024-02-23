class MyMainemployee {
    private int id;
    private String name;

    public MyMainemployee() {
        id = 45;
        name = "your-name-here";
    }
    public MyMainemployee(String myName, int myid) {
        id = myid;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class constructors {
    public static void main(String[] args) {
        
    
    // MyMainemployee ayush = new MyMainemployee("Ayush jha",12);
    MyMainemployee ayush = new MyMainemployee();
    // ayush.setName("Ayush jha");
    // ayush.setId(34);
    System.out.println(ayush.getId());
    System.out.println(ayush.getName());

    }
}
