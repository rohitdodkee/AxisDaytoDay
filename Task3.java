public class Task3 {

    public String name;
    private int UserID;
    protected int Age;
    public String CompanyName;
    public String place;
    private String position;


    void createuser(String name, int UserID, int Age, String CompanyName, String place, String position){

        this.name = name;
        this.UserID = UserID;
        this.Age = Age;
        this.CompanyName = CompanyName;
        this.place = place;
        this.position = position;
    }

    void displayuser(){
        System.out.println("Name: " +name);
        System.out.println("User ID: " +UserID);
        System.out.println("Age: " +Age);
        System.out.println("Company name: " +CompanyName);
        System.out.println("Place: " +place);
        System.out.println("Position: " +position );
    }
public static void main(String[] args) {

    Task3 in = new Task3();
    in.createuser("Rohit", 23423, 23, "Wipro", "Pune", "Developer");
    in.displayuser();

    System.out.println(); 
    
    Task3 we = new Task3();
    we.createuser("Pavan", 2123 , 24, "Amazon", "Mumbai", "SDE");
    we.displayuser();
}
}
