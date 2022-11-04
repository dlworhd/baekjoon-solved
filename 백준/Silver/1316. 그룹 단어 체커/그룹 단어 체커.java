import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            if (check(br.readLine())) {
                cnt++;
            }

        }
        System.out.println(cnt);
    }

    static boolean check(String str) {
        boolean[] check = new boolean[26];
        int prev = 0;

        for (int i = 0; i < str.length(); i++) {
            int now = str.charAt(i);

            if (now != prev) {

                if (check[now - 'a']) {
                    return false;
                } else {
                    check[now - 'a'] = true;
                    prev = now;
                }

            } else {
                continue;
            }

        }
        return true;
    }

}
