import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        while (true) {
            int cnt = 0;

            int n = sc.nextInt();
            if (n == 0) {
                break;
            } else if(n == 1){
                System.out.println(1);
                continue;
            }

            for (int i = n + 1; i < 2 * n; i++) {

                if (n == 0) {
                    break;
                }
                boolean isPrime = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
    }
}