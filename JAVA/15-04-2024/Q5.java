import java.util.*;
public class Q5 {
    int roll; double score; String name;
    Q5(){
        score=0;
    }
    Q5(String name, int roll)
    {
        this.name=name; this.roll=roll;
    }
    void setscore(double score) throws IllegalAccessException
    {
            if(score<0 || score>100)
            {
                throw new IllegalAccessException("Not a valid score.");
            }

        this.score=score;
    }
    public static void main(String[] args) {
        double score;
        System.out.print("Enter score : ");
        Scanner sc=new Scanner(System.in);
        score=sc.nextDouble();
        Q5 obj = new Q5();
        try{
            obj.setscore(score);
            System.out.println("The score is : "+obj.score);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
