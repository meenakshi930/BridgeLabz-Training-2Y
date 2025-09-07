package level3;

import java.util.Arrays;

public class NumberChecker2 {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }
    public static int sumDigits(int[] d) {
        int s = 0; for (int x : d) s += x; return s;
    }
    public static int sumSquares(int[] d) {
        int s = 0; for (int x : d) s += Math.pow(x, 2); return s;
    }
    public static boolean isHarshad(int n) {
        int[] d = getDigits(n);
        return n % sumDigits(d) == 0;
    }
    public static int[][] digitFrequency(int n) {
        int[] freq = new int[10];
        for (int x : getDigits(n)) freq[x]++;
        int[][] res = new int[10][2];
        for (int i = 0; i < 10; i++) {
            res[i][0] = i; res[i][1] = freq[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] d = getDigits(num);
        System.out.println("Digits: " + Arrays.toString(d));
        System.out.println("Sum: " + sumDigits(d));
        System.out.println("Sum Squares: " + sumSquares(d));
        System.out.println("Harshad? " + isHarshad(num));
        System.out.println("Frequency: ");
        for (int[] f : digitFrequency(num)) {
            if (f[1] > 0) System.out.println(f[0] + " -> " + f[1]);
        }
    }
}

