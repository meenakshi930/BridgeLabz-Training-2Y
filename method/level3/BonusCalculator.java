package level3;

import java.util.Random;

public class BonusCalculator {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] employees = new int[10][2]; // [salary, years]
        double[][] results = new double[10][2]; // [new salary, bonus]

        double totalOld = 0, totalNew = 0, totalBonus = 0;

        for (int i = 0; i < 10; i++) {
            employees[i][0] = 10000 + rand.nextInt(90000); // 5-digit salary
            employees[i][1] = 1 + rand.nextInt(10); // years
            totalOld += employees[i][0];

            double bonus = employees[i][0] * (employees[i][1] > 5 ? 0.05 : 0.02);
            double newSalary = employees[i][0] + bonus;

            results[i][0] = newSalary;
            results[i][1] = bonus;
            totalNew += newSalary;
            totalBonus += bonus;
        }

        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < 10; i++) {
            System.out.println((i+1)+"\t"+employees[i][0]+"\t"+employees[i][1]+"\t"+
                               String.format("%.2f",results[i][1])+"\t"+
                               String.format("%.2f",results[i][0]));
        }
        System.out.println("Total Old: "+totalOld+" | Total New: "+totalNew+" | Total Bonus: "+totalBonus);
    }
}
