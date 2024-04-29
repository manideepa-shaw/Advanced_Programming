//WAP that accepts height in cm as int and displays the height in feet and inches. Assume, 1 inch equals to 2.54cm and 1 foot equals to 30.5cm

import java.util.*;
public class Three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height;
        double inch=2.54,foot=30.5;
        System.out.print("Enter height : ");
        height = sc.nextInt();
        double f=height/foot; 
        double i=(height%foot)/inch;
        System.out.println("Foot : "+(int)f+" Inch : "+i);
    }
}
