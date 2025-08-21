import java.util.Scanner;
public class doubleoperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a ;
        System.out.print("a: ");
        a = input.nextInt();
        Scanner input1 = new Scanner(System.in);
        double b ;
        System.out.print("b: ");
        b= input.nextInt();
         Scanner input2 = new Scanner(System.in);
        double c ;
        System.out.print("c: ");
        c= input.nextInt();
        double result1= a + b *c;
        double result2= a * b + c;
        double result3 =c + a / b;
        double result4 =a % b + c;
        System.out.println("result1: "+result1);
        System.out.println("result2: "+result2);
        System.out.println("result3: "+result3);
        System.out.println("result4: "+result4);
        input.close();
        input1.close();
        input2.close();
        
        
        

    }
    
}

