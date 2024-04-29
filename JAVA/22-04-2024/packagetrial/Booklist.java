package packagetrial;
public class Booklist{
    public int bid,purchased,available;
    public String title;
    public Booklist()
    {}
    public Booklist(int bid,String title,int purchased)
    {
        this.bid=bid;   this.title=title;   this.purchased=purchased;   this.available=purchased;
    }
    public void display()
    {
        System.out.println("Book ID : "+bid);
        System.out.println("Title : "+title);
        System.out.println("Purchjased : "+purchased);
        System.out.println("Available : "+available);
        System.out.println("--------------------------------------");
    }
    public void setPurchased(int p)
    {
        purchased=p;
        available+=p;
    }
    public void setAvailable(int a)
    {
        available=a;
    }
    public void setAvailable()
    {
        available--;
    }
}
