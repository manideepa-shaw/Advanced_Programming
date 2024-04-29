package packagetrial;

public class Memberlist {
    public int mid,nob,limit=2;
    public String name,dob;
    public Memberlist(int mid, String name,String dob)
    {
        this.mid=mid;
        this.name=name;
        this.dob=dob;
        this.nob=0;
    }
    public void setnob()
    {
        nob++;
    }
    public void display()
    {
        System.out.println("Member ID : "+mid);
        System.out.println("Name : "+name);
        System.out.println("DOB : "+dob);
        System.out.println("Number of books issued : "+nob);
        System.out.println("Limit : "+limit);
        System.out.println("----------------------------------------");
    }
}
