import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] paper = new int[101][101];


        int n = sc.nextInt();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int q = sc.nextInt();

            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    paper[paper.length - 10 - q + j][k + p]++;

                }
            }
        }

        for (int i = 0; i < paper.length; i++) {
            for (int j = 0; j < paper[i].length ; j++) {
                if(paper[i][j] > 0){
                    result++;
                }
            }
        }
        System.out.println(result);
    }

}