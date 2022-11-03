import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = new Integer[10];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (Integer.parseInt(br.readLine()) % 42);
        }
        
        HashSet<Integer> set = new HashSet<>(Arrays.asList(arr));
        System.out.println(set.size());
    }
}
