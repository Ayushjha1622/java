class employee{
    private int id;
    private String name;

    public String getName(){
        return this.name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
         id=i;
    }
    public int getId(){
        return id;
    }
}
public class MyEmployee{
    public static void main(String[] args) {
        employee ayush = new employee();
        // ayush.id=45;
        // ayush.name = "Ayush jha";  throws an error due to private access modifier
        ayush.setName("Ayush jha");
        System.out.println(ayush.getName());
        ayush.setId(56);
        System.out.println(ayush.getId());
    }
}
