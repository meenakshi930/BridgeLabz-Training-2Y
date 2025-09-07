package level3;

import java.util.Random;

public class OTPGenerator {
    public static String generateOTP(int length) {
        Random rand = new Random();
        StringBuilder otp = new StringBuilder();
        for (int i = 0; i < length; i++) {
            otp.append(rand.nextInt(10));
        }
        return otp.toString();
    }

    public static void main(String[] args) {
        System.out.println("Generated OTP: " + generateOTP(6));
    }
}
