import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[2];

        for (int i = 0; i < 2; i++) {
            String str = st.nextToken();

            char tmp = 0;
            char[] charArr = str.toCharArray();
            for (int j = 0; j < charArr.length / 2; j++) {
                tmp = charArr[j];
                charArr[j] = charArr[charArr.length - 1];
                charArr[charArr.length - 1] = tmp;
            }

            int n = Integer.parseInt(new String(charArr));
            arr[i] = n;
        }

        System.out.println(Math.max(arr[0], arr[1]));

    }
}
