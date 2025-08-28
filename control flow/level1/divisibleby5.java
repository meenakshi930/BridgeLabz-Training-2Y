import java.util.Scanner;
public class divisibleby5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        System.out.print("Enter the number: ");
        number = input.nextDouble();
        boolean final_result = number%5==0;
        System.out.println("number is " + number + " answer is  " + final_result);
        input.close();

    }
}