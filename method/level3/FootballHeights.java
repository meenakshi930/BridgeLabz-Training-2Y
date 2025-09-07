package level3;

import java.util.Random;

public class FootballHeights {
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int val : arr) sum += val;
        return sum;
    }
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }
    public static int findShortest(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int val : arr) if (val < min) min = val;
        return min;
    }
    public static int findTallest(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int val : arr) if (val > max) max = val;
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101);
        }
        System.out.println("Heights: ");
        for (int h : heights) System.out.print(h + " ");
        System.out.println("\nShortest: " + findShortest(heights));
        System.out.println("Tallest: " + findTallest(heights));
        System.out.println("Mean: " + String.format("%.2f", findMean(heights)));
    }
}
