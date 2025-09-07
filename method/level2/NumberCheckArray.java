package level2;
import java.util.Scanner;

public class NumberCheckArray {
    public static boolean isPositive(int num) { return num >= 0; }
    public static boolean isEven(int num) { return num % 2 == 0; }
    public static int compare(int n1, int n2) {
        if (n1 > n2) return 1;
        else if (n1 == n2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i+1) + ": ");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                System.out.print(arr[i] + " is Positive and ");
                if (isEven(arr[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println(arr[i] + " is Negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result == 0) System.out.println("First and Last elements are Equal");
        else if (result == 1) System.out.println("First element is Greater than Last");
        else System.out.println("First element is Smaller than Last");
        sc.close();
    }
}
