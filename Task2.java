
import java.util.Scanner;

public class Task2
{   
    public String name;
    public String company;
    private int UserID;
    private String Position;
    protected  int age;

    public Task2(String name, String company, int userID, String position, int age) {
        this.name = name;
        this.company = company;
        UserID = userID;
        Position = position;
        this.age = age;
    }

    void Display()
    {
        System.out.println("Name: " +name);
        System.out.println("User Id : "+UserID);
        System.out.println("Age :"+age);
        System.out.println("company name : " + company);
        System.out.println("Position :"+Position);
        
    }

   public static void main (String[]args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name");
        String name = sc.next();
    System.out.println("Enter UserID");
        int UserID = sc.nextInt();
    System.out.println("Enter age");
        int age=sc.nextInt();
    System.out.println("Enter Company_name");
        String company = sc.next();
    System.out.println("Enter Position");
        String Position=sc.next();
     
     
    Task2 info= new Task2( name, company, UserID, Position,  age);
      info.Display();

   }
}