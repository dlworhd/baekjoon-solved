import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        int[] chsArr = new int[]{1, 1, 2, 2, 2, 8};
        for (int i = 0; i < arr.length; i++) {
            int n = sc.nextInt();
            arr[i] = chsArr[i] - n;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }


    }
}
