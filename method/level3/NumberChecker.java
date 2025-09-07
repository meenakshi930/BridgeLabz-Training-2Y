package level3;

import java.util.Arrays;

public class NumberChecker {
    public static int countDigits(int n) {
        return String.valueOf(n).length();
    }
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static boolean isDuck(int n) {
        String s = String.valueOf(n);
        return s.contains("0") && s.charAt(0) != '0';
    }
    public static boolean isArmstrong(int n) {
        int[] d = getDigits(n);
        int p = d.length, sum = 0;
        for (int x : d) sum += Math.pow(x, p);
        return sum == n;
    }
    public static int[] largestTwo(int[] d) {
        int l = Integer.MIN_VALUE, sl = Integer.MIN_VALUE;
        for (int x : d) {
            if (x > l) { sl = l; l = x; }
            else if (x > sl && x != l) sl = x;
        }
        return new int[]{l, sl};
    }
    public static int[] smallestTwo(int[] d) {
        int s = Integer.MAX_VALUE, ss = Integer.MAX_VALUE;
        for (int x : d) {
            if (x < s) { ss = s; s = x; }
            else if (x < ss && x != s) ss = x;
        }
        return new int[]{s, ss};
    }

    public static void main(String[] args) {
        int num = 153;
        int[] digits = getDigits(num);
        System.out.println("Number: " + num);
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Count: " + countDigits(num));
        System.out.println("Duck? " + isDuck(num));
        System.out.println("Armstrong? " + isArmstrong(num));
        System.out.println("Largest & 2nd: " + Arrays.toString(largestTwo(digits)));
        System.out.println("Smallest & 2nd: " + Arrays.toString(smallestTwo(digits)));
    }
}
