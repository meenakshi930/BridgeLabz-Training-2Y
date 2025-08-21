/*write a program to input the unit price of an item and the quantity to be bought. Then, calculate the total price.
Hint => NA
I/P => unitPrice, quantity
O/P => The total purchase price is INR ___ if the quantity ___ and unit price is INR ___ */

import java.util.Scanner;
public class price {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double unitprice ;
        System.out.print("unitprice: ");
        unitprice = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        double quantity ;
        System.out.print("quantity : ");
        quantity= input1.nextInt();
        double totalprice = quantity *unitprice;
        System.out.println(" totalprice:"+ totalprice);
        input.close();
        input1.close();
    }
}
