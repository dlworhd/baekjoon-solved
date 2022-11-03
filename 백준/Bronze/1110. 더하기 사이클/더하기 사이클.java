import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int tmp = n;
        int cnt = 0;

        while (true){
            int a = 0;

            if(tmp > 9){
                a = tmp / 10;
            } else {
                a = 0;
            }
            int b = tmp % 10;
            int sum = a + b;

            int x = b;
            int y = sum % 10;

            tmp = (x * 10) + y;
            cnt++;

            if(n == tmp){
                break;
            }
        }

        System.out.println(cnt);



    }
}