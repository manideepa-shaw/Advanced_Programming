import java.util.*;
import packagetrial.*;
public class Q3 {
    public static void main(String[] args) {
        int bid,purchased,available;
        String title;

        int mid,nob;
        String name,dob;

        Booklist bList[]=new Booklist[20];
        Memberlist mList[]=new Memberlist[30];
        Transaction tList[]=new Transaction[20];
        int b=0,m=0,t=0,choice;

        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter book id as -999 to stop.");
            int present=0;
            System.out.print("Enter bid : ");
            bid=sc.nextInt();   sc.nextLine();
            if(bid==-999)   break;
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
        }
        // display books
        for(int i=0; i<b;i++)
        {
            bList[i].display();
        }

        // entering member list
        while(true)
        {
            System.out.println("--------------------------------------------------------\nNow take inputs for members\nEnter member id as -999 to stop.");
            int present=0;
            System.out.print("Enter mid : ");
            mid=sc.nextInt();   sc.nextLine();
            if(mid==-999)   break;
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
        }
        
        // display members
        for(int i=0; i<m;i++)
        {
            mList[i].display();
        }

        System.out.println("Inputs taken. The System is ready for transactions.");
        while(true)
        {
            System.out.println("1.Issue Book\n2.Change number of copies of book.\n3.Display Book details\n4.Display Student details\n5.Return");
            choice=sc.nextInt();   sc.nextLine();
            switch(choice)
            {
                case 1:
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
                        mid=sc.nextInt();   sc.nextLine();
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
                                tList[t]=new Transaction(mid, bid);
                                t++;
                            }
                        }
                    }
                }
                break;

                case 2:
                System.out.print("Enter book id : ");
                bid=sc.nextInt();   sc.nextLine();
                i=0;
                while(i<b)
                {
                    if(bList[i].bid==bid)
                        break;
                    i++;
                }
                if(i==b)
                {
                    System.out.println("Book Id not present.");
                }
                else
                {
                    System.out.print("Enter number of copies added : ");
                    purchased = sc.nextInt();sc.nextLine();
                    bList[i].setPurchased(purchased);
                }
                break;
                case 3:
                // display books
                for(i=0; i<b;i++)
                {
                    bList[i].display();
                }
                break;
                case 4:
                // display members
                for(i=0; i<m;i++)
                {
                    mList[i].display();
                }
                break;
                case 5:
                System.out.print("Enter bid : ");
                bid=sc.nextInt();   sc.nextLine();
                i=0;
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
                    mid=sc.nextInt();   sc.nextLine();
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
                break;
                default: System.out.println("Wrong Choice");

            }
        }

    }
}
