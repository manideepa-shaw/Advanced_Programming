import java.util.*;
public class Q7 {
    public static void main(String[] args) {
        String words;
        String word[];
        System.out.print("Enter line : ");
        Scanner sc = new Scanner(System.in);
        words=sc.nextLine();
        word=words.split(" ");
        int c=0;
        for( String str : word)
        {
            if(str.toLowerCase().equals("a"))
                c++;
        }
        System.out.println("No of times a arrpeared : "+c);
        c=0;
        for( String str : word)
        {
            if(str.toLowerCase().equals("and"))
                c++;
        }
        System.out.println("No of times and arrpeared : "+c);
        if(word[0].toLowerCase().equals("the"))
        System.out.println("The Sentence started with The.");
        else
        System.out.println("The Sentence didnot start with The.");

        char arr[] = new char[50];
        for(int i=0; i<words.length(); i++)
        {
            arr[i]= words.charAt(i) ;
        }
        System.out.println(arr);
        
        System.out.println("The token used is ' '");
        for (String str : word )
        {
            System.out.println(str);
        }
    }
}
