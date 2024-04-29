import java.util.*;
class Customer
{
    protected long cid, phone;
    protected String name;
    protected double loan=0, credit=200000;
    Customer(){}
    Customer(long cid, long phone, String name, double loan)
    {
        if(loan>credit)
        {
            System.out.println("Loan amounmt cannot be granted.");
            this.cid=cid;   this.phone=phone;   this.name=name;
        }
        else{
        this.loan=this.credit-loan;
        }
    }
    Customer(long cid, long phone, String name, double loan, double credit)
    {
        this.cid=cid;   this.phone=phone;   this.name=name; this.credit=credit;
        this.loan=this.credit-loan;
    }
    void setData(long phone)
    {
        this.phone=phone;
    }
    void setData(String name)
    {
        this.name=name;
    }
    void setData(long phone, String name)
    {
        this.phone=phone;   this.name=name;
    }
    void showDetails()
    {
        System.out.println("Customer ID : "+cid+"\nName : "+name+"\nPhone No. : "+phone+"\nCredit Limit : "+credit+"\nLoan Taken : "+loan);
        System.out.println("---------------------------------------------------------------------\n");
    }
}
class PrivilegedCustomer extends Customer
{
    PrivilegedCustomer(long cid, long phone, String name, long loan)
    {
        super(cid,phone,name,loan,500000);
    }
}
public class Q1
{

    public static void main(String[] args)
    {
        //bank already has some customers. They are as follows
        Customer c1 = new Customer(65874963L, 9876541485L, "Harsh Srivastav",300000);
        PrivilegedCustomer c2 = new PrivilegedCustomer(64874963L, 9876541485L, "Manideeepa Shaw",300000);
        c1.showDetails();
        c2.showDetails();
        System.out.println("Changing name for "+c1.name+"\n");
        c1.setData("New Name");
        c1.showDetails();
        System.out.println("Changing name for "+c2.name+"\n");
        c2.setData(6587493214L,"New Name2");
        c2.showDetails();
    }
}