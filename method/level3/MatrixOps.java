package level3;

import java.util.Random;

public class MatrixOps {
    public static int[][] randomMatrix(int r, int c) {
        Random rand = new Random();
        int[][] mat = new int[r][c];
        for (int i=0;i<r;i++)
            for (int j=0;j<c;j++)
                mat[i][j] = rand.nextInt(10);
        return mat;
    }

    public static int[][] add(int[][] A, int[][] B) {
        int r=A.length, c=A[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=A[i][j]+B[i][j];
        return res;
    }

    public static int[][] subtract(int[][] A, int[][] B) {
        int r=A.length, c=A[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) res[i][j]=A[i][j]-B[i][j];
        return res;
    }

    public static int[][] multiply(int[][] A, int[][] B) {
        int r=A.length, c=B[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++)
            for(int k=0;k<A[0].length;k++) res[i][j]+=A[i][k]*B[k][j];
        return res;
    }

    public static void print(int[][] M) {
        for(int[] row:M){
            for(int val:row) System.out.print(val+" ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A=randomMatrix(2,2);
        int[][] B=randomMatrix(2,2);
        System.out.println("Matrix A:"); print(A);
        System.out.println("Matrix B:"); print(B);
        System.out.println("A+B:"); print(add(A,B));
        System.out.println("A-B:"); print(subtract(A,B));
        System.out.println("A*B:"); print(multiply(A,B));
    }
}

