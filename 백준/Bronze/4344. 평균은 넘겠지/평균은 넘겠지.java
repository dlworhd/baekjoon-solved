import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int num = Integer.parseInt(st.nextToken());
            int[] arr = new int[num];
            int result = 0;
            
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                result += arr[j];
            }

            float average = (float)result / num;
            result = 0;
            int cnt = 0;
            
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] > average){
                    cnt++;
                }
            }

            System.out.printf("%.3f%%",((float)cnt/num * 100));
            System.out.println();
        }
    }
}
