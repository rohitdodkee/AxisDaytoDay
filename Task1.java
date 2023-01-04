import java.util.Scanner;

public class Task1 {

    public String name;
    private int UserID;
    protected int Age;
    public String CompanyName;
    public String place;
    private String position;


    public void createuser(){

    try(Scanner sc = new Scanner(System.in)) {
        System.out.println("Name");
        name = sc.nextLine();
        System.out.println("UserID");
        UserID = sc.nextInt();
        System.out.println("Age");
        Age = sc.nextInt();
        System.out.println("CompanyName");
        CompanyName = sc.next();
        System.out.println("Enter Place ");
        place = sc.next();
        System.out.println("Enter the position ");
        position = sc.next();
    }

    }

    public void displayuser(){
        System.out.println("Name: " +name);
        System.out.println("User ID: " +UserID);
        System.out.println("Age: " +Age);
        System.out.println("Company name: " +CompanyName);
        System.out.println("Place: " +place);
        System.out.println("Position: " +position );
    }
public static void main(String[] args) {

    Task1 in = new Task1();
    in.createuser();
    in.displayuser();
}
}




    
    



    

