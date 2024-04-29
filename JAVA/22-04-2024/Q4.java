import java.util.Scanner;

import packagetrial.Booklist;
import packagetrial.Memberlist;
import packagetrial.Transaction;

interface outerQ4 {
    int addBook();
    void searchBook();
    void viewAllBook();
    int addMember();
    void searchMember();
    void viewAllMembers();
    void issueBook();
    void returnBook();
}
public class Q4 implements outerQ4
{
    int bid,purchased,available;
    String title;
    Scanner sc = new Scanner(System.in);
    
    public int addBook(int b, Booklist[] bList)
    {
        int present=0;
            System.out.print("Enter bid : ");
            bid=sc.nextInt();   sc.nextLine();
            for(int i=0;i<b;i++)
            {
                if(bList[i].bid==bid)
                {
                    System.out.println("BookId already exists.");
                    present=1;
                    break;
                }
            }
            if(present==0)
            {
                System.out.print("Enter title : ");
                title=sc.nextLine();
                System.out.print("Enter number of bookis purchased : ");
                purchased=sc.nextInt();
                sc.nextLine();
                bList[b]= new Booklist(bid,title,purchased);
                b++;
            }
        return b;
    }
    public void searchBook(int b, Booklist[] bList)
    {
        int present=0;
        System.out.println("Enter bid : ");
        int bid=sc.nextInt();   sc.nextLine();
        for(int i=0;i<b;i++)
        {
            if(bList[i].bid==bid)
            {
                present=1;
                bList[i].display();
                break;
            }
        }
        if(present==0)
        {
            System.out.println("Book not present");
        }
    }
    public void viewAllBook(int b, Booklist[] bList)
    {
        // display books
        for(int i=0; i<b;i++)
        {
            bList[i].display();
        }
    }

    public int addMember(int m, Memberlist[] mList)
    {
        int mid,nob;
        String name,dob;
        int present=0;
        System.out.print("Enter mid : ");
        mid=sc.nextInt();   sc.nextLine();
        for(int i=0;i<m;i++)
        {
            if(mList[i].mid==mid)
            {
                System.out.println("MemberId already exists.");
                present=1;
                break;
            }
        }
        if(present==0)
        {
            System.out.print("Enter Member name : ");
            name=sc.nextLine();
            System.out.print("Enter date of birth : ");
            dob=sc.nextLine();
            mList[m]= new Memberlist(mid,name,dob);
            m++;
        }
        return m;
    }
    public void searchMember(int m, Memberlist[] mList)
    {
        int present=0;
        System.out.println("Enter mid : ");
        int mid=sc.nextInt();   sc.nextLine();
        for(int i=0;i<m;i++)
        {
            if(mList[i].mid==mid)
            {
                mList[i].display();;
                present=1;
                break;
            }
        }
        if(present==0)
        {
            System.out.println("Member doesnot existe.");
        }
    }
    public void viewAllMembers(int m, Memberlist[] mList)
    {
        // display members
        for(int i=0; i<m;i++)
        {
            mList[i].display();
        }     
    }
    public void issueBook(int m, Memberlist[] mList,int b, Booklist[] bList)
    {
        System.out.print("Enter Book Id : ");
        bid=sc.nextInt();   sc.nextLine();
        int i=0;
        while(i<b)
        {
            if(bList[i].bid==bid)
                break;
            i++;
        }
        if(i==b)
        {
            System.out.println("Book not found!!!");
        }
        else
        {
            if(bList[i].available==0)
            {
                System.out.println("Book Not Available.");
            }
            else
            {
                System.out.println("Enter Member Id : ");
                int mid=sc.nextInt();   sc.nextLine();
                int j=0;
                while(j<m)
                {
                    if(mList[j].mid==mid)   break;
                    j++;
                }
                if(m==j)
                {
                    System.out.println("MemberId Not Present.");
                }
                else
                {
                    if(mList[j].nob==mList[j].limit)
                    {
                        System.out.println("Limit exceeding");
                    }
                    else{
                        bList[i].setAvailable();
                        mList[j].setnob();
                    }
                }
            }
        }
    }

    public void returnBook(int m, Memberlist[] mList,int b, Booklist[] bList)
    {
        System.out.print("Enter bid : ");
        bid=sc.nextInt();   sc.nextLine();
        int i=0;
        while(i<b)
        {
            if(bList[i].bid==bid)   break;
            i++;
        }
        if(b==i)
        {
            System.out.println("Book Id Not Found.");
        }
        else
        {
            System.out.print("Enter member ID : ");
            int mid=sc.nextInt();   sc.nextLine();
            int j=0;
            while(j<m)
            {
                if(mList[j].mid==mid)   break;
                j++;
            }
            if(m==j)
            {
                System.out.println("Member Id Not Found.");
            }
            else{
                mList[j].nob-=1;
                bList[i].available+=1;
            }
        }
    }
    public static void main(String[] args) 
    {
    
        Booklist bList[]=new Booklist[20];
        Memberlist mList[]=new Memberlist[30];
        Transaction tList[]=new Transaction[20];
        int b=0,m=0,t=0,choice;
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("1.Add a book\n2.Search Book\n3.View All Book\n4.Add Member\n5.Search a member\n6.View all members\n7.Issue Book\n8.Return Book");
            choice = sc.nextInt();  sc.nextLine();
            Q4 obj = new Q4();
            switch(choice)
            {
                case 1:
                b=obj.addBook(b,bList);  break;
                case 2:
                obj.searchBook(b,bList);   break;
                case 3:
                obj.viewAllBook(b,bList);  break;
                case 4:
                m=obj.addMember(m,mList);    break;
                case 5:
                obj.searchMember(m,mList); break;
                case 6:
                obj.viewAllMembers(m,mList);   break;
                case 7:
                obj.issueBook(m,mList,b,bList);    break;
                case 8:
                obj.returnBook(m,mList,b,bList);   break;
            }
        }
    }
}
