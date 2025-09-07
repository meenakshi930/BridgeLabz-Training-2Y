package level3;

public class MatrixAdvanced {
    public static int[][] transpose(int[][] A) {
        int r=A.length, c=A[0].length;
        int[][] T=new int[c][r];
        for(int i=0;i<r;i++) for(int j=0;j<c;j++) T[j][i]=A[i][j];
        return T;
    }

    public static int determinant2x2(int[][] A) {
        return A[0][0]*A[1][1]-A[0][1]*A[1][0];
    }

    public static int determinant3x3(int[][] A) {
        return A[0][0]*(A[1][1]*A[2][2]-A[1][2]*A[2][1])
             - A[0][1]*(A[1][0]*A[2][2]-A[1][2]*A[2][0])
             + A[0][2]*(A[1][0]*A[2][1]-A[1][1]*A[2][0]);
    }

    public static double[][] inverse2x2(int[][] A) {
        int det=determinant2x2(A);
        if(det==0) return null;
        double[][] inv=new double[2][2];
        inv[0][0]=A[1][1]/(double)det;
        inv[0][1]=-A[0][1]/(double)det;
        inv[1][0]=-A[1][0]/(double)det;
        inv[1][1]=A[0][0]/(double)det;
        return inv;
    }

    public static void print(double[][] M) {
        for(double[] row:M){
            for(double val:row) System.out.print(String.format("%.2f ",val));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] A={{4,7},{2,6}};
        System.out.println("Det 2x2: "+determinant2x2(A));
        double[][] inv=inverse2x2(A);
        System.out.println("Inverse:"); print(inv);
    }
}
