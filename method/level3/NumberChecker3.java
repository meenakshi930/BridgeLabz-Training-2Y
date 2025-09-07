package level3;

import java.util.Arrays;

public class NumberChecker3 {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static int[] reverse(int[] arr) {
        int[] r = new int[arr.length];
        for (int i = 0; i < arr.length; i++) r[i] = arr[arr.length - 1 - i];
        return r;
    }
    public static boolean isEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }
    public static boolean isPalindrome(int n) {
        int[] d = getDigits(n);
        return isEqual(d, reverse(d));
    }
    public static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.contains("0") && s.charAt(0) != '0';
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println("Palindrome? " + isPalindrome(num));
        System.out.println("Duck? " + isDuck(num));
    }
}
