import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;


//A = 고정비용, B = 가변비용, C = 판매가격
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(c <= b){
            System.out.println(-1);
        } else {
            System.out.println(a/(c-b) + 1);
        }

    }
}
