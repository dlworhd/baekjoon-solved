import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {


        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();


        int min = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = M; i <= N; i++) {

            boolean isPrime = true;

            //0은 자연수라서 어차피 포함 x
            if(i == 1){
                continue;
            }

            //루트2는 j보다 작아서 2를 소수로 판단
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    isPrime = false;
                    break;
                }
            }

            if(isPrime){
                min = i < min ? i : min;
                sum += i;
            }

        }

        if(sum == 0){
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}