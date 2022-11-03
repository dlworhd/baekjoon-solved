import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        int[] arr = new int[]{1, 1, 2, 2, 2, 8};
        int[] result = new int[6];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");

        for (int i = 0; i < strArr.length; i++) {
            result[i] = arr[i] - Integer.parseInt(strArr[i]);
        }
        
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
