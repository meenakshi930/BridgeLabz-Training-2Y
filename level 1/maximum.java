/*Create a program to find the maximum number of handshakes among N number of students.
Hint => 
Get integer input for numberOfStudents variable.
Use the combination = (n * (n - 1)) / 2 formula to calculate the maximum number of possible handshakes.
Display the number of possible handshakes.
 */
import java.util.Scanner;
public class maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n ;
        System.out.print("number of students: ");
        n= input.nextInt();
        int handshake = (n * (n - 1)) / 2;
        System.out.println("number of possible handshakes:"+handshake);
        input.close();
    }
}
