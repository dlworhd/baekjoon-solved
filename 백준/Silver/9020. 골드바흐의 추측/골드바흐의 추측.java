import java.util.Scanner;

public class Main {
    static boolean[] Prime = new boolean[10001];

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        get_Prime();

        int T = sc.nextInt();


        while(T-- > 0){

            int n = sc.nextInt();
            int p = n / 2;
            int q = n / 2;


            while(true){
                if(Prime[p] == false && Prime[q] == false){
                    System.out.println(p + " " + q);
                    break;
                }

                p--;
                q++;
            }
            
        }

    }
    
    public static void get_Prime() {

        //소수가 아니므로 true
        Prime[0] = Prime[1] = true;

        for (int i = 2; i <= Math.sqrt(Prime.length); i++) {
            if (Prime[i]) {
                continue;
            }
            for (int j = i * i; j < Prime.length; j += i) {
                Prime[j] = true;
            }
        }

    }
}