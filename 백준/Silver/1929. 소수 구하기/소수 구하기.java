import java.util.Scanner;

public class Main {

    public static boolean[] prime;
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        //1부터 판단해서 + 1
        prime = new boolean[m + 1];

        get_Prime();

        for (int i = n; i <= m; i++) {
            if(prime[i] == false){
                System.out.println(i);
            }
        }

    }

    public static void get_Prime(){
        prime[0] = prime[1] = true;

        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            if(prime[i]){
                continue;
            }
            for (int j = i * i; j < prime.length; j+=i) {
                prime[j] = true;
            }
        }
    }
}