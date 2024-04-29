//Accepts number of command line parameters and display the parameters and count of such parameters

public class Two {
    public static void main(String[] args) {
        System.out.println("No. of command line arguments are : "+args.length);
        System.out.print("The arguments are : \n");
        for(int i=0;i<args.length;i++)
            System.out.println(args[i]);
    }
}
