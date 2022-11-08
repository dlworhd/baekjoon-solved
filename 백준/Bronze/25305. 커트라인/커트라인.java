import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int total = Integer.parseInt(st1.nextToken());
        int only = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[total];

        int i = 0;
        while (st2.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st2.nextToken());
        }

        Arrays.sort(arr);

        System.out.println(arr[arr.length - only]);
    }

}