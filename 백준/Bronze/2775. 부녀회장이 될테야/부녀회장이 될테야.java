import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        int[][] arr = new int[15][15];

        for (int j = 1; j < arr[0].length; j++) {
            arr[0][j] = j;
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr[0].length; j++) {

                int result = 0;
                for (int k = 1; k <= j; k++) {
                    result += arr[i - 1][k];
                }
                arr[i][j] = result;
            }
        }

        int num = sc.nextInt();


        for (int i = 0; i < num; i++) {
            int k = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(arr[k][n]);
        }


    }
}