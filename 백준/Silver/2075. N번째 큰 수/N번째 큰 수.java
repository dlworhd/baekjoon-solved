import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Map<Integer, List<Integer>> map = new HashMap<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2;
		int n = Integer.parseInt(st.nextToken());

		PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			st2 = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; j++) {
				int num = Integer.parseInt(st2.nextToken());
				queue.add(num);
			}
		}


		for (int i = 1; i <= n; i++) {
			if (i == n) {
				System.out.println(queue.poll());
			} else {
				queue.poll();
			}
		}
	}
}