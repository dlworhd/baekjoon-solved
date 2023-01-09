import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {


		PriorityQueue<Integer> queue = new PriorityQueue(Collections.reverseOrder());

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());

		StringTokenizer st2;
		for (int i = 0; i < n; i++) {
			st2 = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st2.nextToken());

			if (num != 0) {
				queue.add(num);
			} else if (num == 0) {
				if (queue.isEmpty()) {
					System.out.println(0);
				} else {
					System.out.println(queue.poll());
				}
			}
		}
	}
}
