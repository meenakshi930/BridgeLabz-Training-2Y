package level3;

import java.util.Random;

public class StudentMarks {
    public static void main(String[] args) {
        Random rand = new Random();
        int students = 5; 
        int[][] marks = new int[students][3]; 
        double[][] results = new double[students][3]; // total, avg, %

        for (int i=0;i<students;i++) {
            marks[i][0] = 30 + rand.nextInt(71); // physics
            marks[i][1] = 30 + rand.nextInt(71); // chemistry
            marks[i][2] = 30 + rand.nextInt(71); // maths
            int total = marks[i][0]+marks[i][1]+marks[i][2];
            double avg = total/3.0;
            double perc = (total/300.0)*100;
            results[i][0]=total; results[i][1]=avg; results[i][2]=perc;
        }

        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\t%\n");
        for (int i=0;i<students;i++) {
            System.out.println((i+1)+"\t"+marks[i][0]+"\t"+marks[i][1]+"\t"+marks[i][2]+"\t"+
                               results[i][0]+"\t"+
                               String.format("%.2f",results[i][1])+"\t"+
                               String.format("%.2f",results[i][2]));
        }
    }
}
