import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int cnt = 0;
        for (int i = 1; i <= n; i++) {

            if(i < 100){
                cnt++;
            } else if(i < 1000){
                int a = i / 100;
                int b = (i % 100) / 10;
                int c = i % 10;

                if(a - b == b - c){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);

    }
}

