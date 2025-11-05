import java.util.Scanner;
public class bankProgram
{
    String name;
    double balence;
    Scanner s;
     int ch;
    void menu()
    {
        
        switch (ch) {
            case 1:
                s=new Scanner(System.in);
                System.out.println("Enter Amount to Deposit : ");
                deposit(s.nextDouble());
                break;

            case 2:
                s=new Scanner(System.in);
                System.out.println("Enter Amount to Widraw : ");
                widraw(s.nextDouble());
                break;    
              
            case 3:
               System.out.println("Available Balence : "+balence);
                break;
               
            case 0:
                System.out.println("Exiting... Thank you!");
                break;    

            default:
            System.out.println("Please Enter 1, 2 or 3 only.");
                break;
        }
    }
    void setData(String name,double balence)
    {
         this.name=name;
         this.balence=balence;
    }
    void deposit(double dep)
    {
         balence+=dep;
        System.out.println("Amount Deposited successfully.");
        System.out.println("Available Balence : "+balence);
    }
    void widraw(double wd)
    {
      balence-=wd;
      System.out.println("Amount Widraw successfully.");
        System.out.println("Available Balence : "+balence);
    }
    void displayDetails()
    {
         System.out.println("Name : "+name);
    }
    public static void main(String[] args) 
    {
        bankProgram t1=new bankProgram();
        t1.setData("Ajay",50000);
        t1.displayDetails();
        Scanner s=new Scanner(System.in);
        do {
            System.out.println("\nEnter 1 to Deposit \nEnter 2 to Withdraw \nEnter 3 to Check Balance \nEnter 0 to Exit");
            t1.ch = s.nextInt();
            t1.menu();
        } while(t1.ch != 0); 
    }
}
