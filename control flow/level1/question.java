import java.util.Scanner;
public class question {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double number;
        System.out.print("Enter the number: ");
        number = input.nextDouble();
            if (number < 40) {
                System.out.println(" student number is " + number + " answer is fail");
        }
        else if (number>=40 && number<100){
             System.out.println(" student number is " + number + " answer is Pass");

        }
        else {
             System.out.println(" student number is " + number + " number is invalid");
        }
    
 input.close();
}
}

