/*Write an IntOperation program by taking a, b, and c as input values and print the following integer operations a + b *c, a * b + c, c + a / b, and a % b + c. Please also understand the precedence of the operators. 
Hint => 
Create variables a, b, and c of int data type.
Take user input for a, b, and c.
Compute 3 integer operations and assign the result to a variable
Finally, print the result and try to understand operator precedence.
I/P => fee, discountPrecent
O/P => The results of Int Operations are ___, ___, and ___ */
import java.util.Scanner;
public class operation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a ;
        System.out.print("a: ");
        a= input.nextInt();
        Scanner input1 = new Scanner(System.in);
        int b ;
        System.out.print("b: ");
        b= input.nextInt();
         Scanner input2 = new Scanner(System.in);
        int c ;
        System.out.print("c: ");
        c= input.nextInt();
        int result1= a + b *c;
        int result2= a * b + c;
        int result3 =c + a / b;
        int result4 =a % b + c;
        System.out.println("result1: "+result1);
        System.out.println("result2: "+result2);
        System.out.println("result3: "+result3);
        System.out.println("result4: "+result4);
        input.close();
        input1.close();
        input2.close();
        
        
        

    }
    
}
