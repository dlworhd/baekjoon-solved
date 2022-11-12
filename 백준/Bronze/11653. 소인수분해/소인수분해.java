import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = 2;


        for (int k = 2; k <= Math.sqrt(n); k++) {

            while (n % k == 0) {
                System.out.println(k);
                n /= k;
            }
        }

        if (n != 1) {
            System.out.println(n);
        }


    }
}