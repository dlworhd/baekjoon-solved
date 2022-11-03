import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        char[][] charArr = new char[n][];

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            charArr[i] = arr;
        }

        int result = 0;
        int[] arr = new int[charArr.length];
        for (int i = 0; i < charArr.length; i++) {
            int sum = 0;
            for (int j = 0; j < charArr[i].length; j++) {
                if(charArr[i][j] == 'O'){
                    sum++;
                    result += sum;
                } else {
                    sum = 0;
                }
            }
            arr[i] = result;
            result = 0;
        }

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
