import java.util.Scanner;
class university1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int fee ;
        System.out.print("Fee: ");
        fee = input.nextInt();
        int discountPercent;
        System.out.print("discountPercentage: ");
        discountPercent = input.nextInt();
        int discount = (fee*discountPercent)/100;
        int finalfee = fee-discount;
        System.out.println("The discount amount is INR"+ discount +" and final discounted fee is INR " +finalfee );
        input.close();
    }
    
}
