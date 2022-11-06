import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = 0;
        int y = 0;


        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");

            //높이
            int H = Integer.parseInt(st.nextToken());
            //가로
            int W = Integer.parseInt(st.nextToken());
            //순서
            int N = Integer.parseInt(st.nextToken());


            //H:6 W:12 N: 10 -> 402


            //층수

            if (N % H == 0) {
                y = H;
            } else {
                y = N % H;
            }


            //호수
            if (N % H == 0) {
                x = N / H;
            } else {
                x = N / H + 1;
            }

            System.out.printf("%d%02d", y, x);
            System.out.println();


        }


    }
}