import java.util.Scanner;

public class Nine {
    long accno;
    double balance,interest=5;
    Nine(long accno, double balance)
    {
        this.accno=accno;
        this.balance=balance;
    }
    void initialize(double interest)
    {
        this.interest=interest;
    }
    void change(double interest)
    {
        this.interest=interest;
    }
    void display()
    {
        System.out.println("Interest Rate : "+interest+"%");
        System.out.println("_________________________________________________");
    }
    void displayBalance()
    {
        System.out.println("Balance : Rs."+balance+"%");
        double x=(balance*interest)/100;
        System.out.println("Interest : Rs."+x);
        double a=x+balance;
        System.out.println("Amount : Rs."+a);
        System.out.println("_________________________________________________");
    }
    public static void main(String[] args) {
        long x;
        double y,z;
        System.out.println("Enter account no. : ");
        Scanner sc = new Scanner(System.in);
        x=sc.nextLong();
        System.out.println("Enter balance : ");
        y=sc.nextInt();
        Nine obj = new Nine(x,y);
        System.out.println("Interest rate without changing interest rate");
        obj.display();
        obj.initialize(6);
        obj.display();
        obj.change(5.8);
        obj.display();
        obj.displayBalance();
    }
}
