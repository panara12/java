import java.util.Scanner;
class matrix2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] a = new int[3][2];
        int[][] b = new int[2][3];
        int[][] c = new int[3][3];
        
        System.out.println("enter first 3*2 matrix");
        for (int i=0;i<3;i++){
            for(int j=0;j<2;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second 2*3 matrix");
        for (int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                b[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j];
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
}