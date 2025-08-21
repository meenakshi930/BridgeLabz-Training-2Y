import java.util.Scanner;
class calculator {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        double number1 ;
        System.out.print("number1: ");
        number1= input.nextInt();
         Scanner input1 = new Scanner(System.in);
        double number2;
        System.out.print("number2: ");
        number2= input1.nextInt();
        double add = number1 + number2;
        double subtract = number1-number2;
        double mul =number1*number2;
        double div=number1/number2;
        System.out.println("addition:"+add);
        System.out.println("subtraction:"+subtract);
        System.out.println("multiplication:"+mul);
        System.out.println("division:"+div);
        input.close();
        input1.close();


    }
    
}