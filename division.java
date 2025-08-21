import java.util.Scanner;
class division {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number1;
        System.out.print("number1: ");
        number1= input.nextInt();
        Scanner input1 = new Scanner(System.in);
        double number2;
        System.out.print("number2: ");
        number2 = input.nextInt();
        double quotient=number1/number2;
        double remainder= number1%number2;
        System.out.println("quotient"+quotient +"remainder"+remainder);
        input.close();
        input1.close();

    }
    
}