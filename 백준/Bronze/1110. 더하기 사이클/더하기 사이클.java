import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int copy = n;
        int cnt = 0;

        while (true) {

            copy = (copy % 10 * 10 ) + (copy / 10 + copy % 10) % 10;
            cnt++;

            if (n == copy) {
                break;
            }
        }
        
        System.out.println(cnt);
    }
}