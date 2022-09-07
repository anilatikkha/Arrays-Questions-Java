package Arrays;

public class Transpose {
    public static void main(String[] args) {
        System.out.println();
        // initialize
        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int row = 3;
        int col = 3;
        // print
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\t ***************\t");
        // transpose
        int n = arr.length - 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int temp = 0;

                if (i == 0 || j == n && j == 0 || j == n) {
                    temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\t ***************\t");

    }
}
