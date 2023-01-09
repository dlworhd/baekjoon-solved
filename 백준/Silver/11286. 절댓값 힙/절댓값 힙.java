import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {

		Comparator comparator = new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				if (Math.abs((Integer) o2) > Math.abs((Integer) o1)) {
					return -1;
				} else if (Math.abs((Integer) o2) == Math.abs((Integer) o1)) {
					if ((Integer) o2 > (Integer) o1) {
						return -1;
					} else if ((Integer) o2 < (Integer) o1) {
						return 1;
					} else {
						return 0;
					}
				} else if (Math.abs((Integer) o2) < Math.abs((Integer) o1)) {
					return 1;
				} else {
					return 0;
				}
			}
		};

		PriorityQueue<Integer> queue = new PriorityQueue<>(comparator);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		StringTokenizer st2;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			st2 = new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st2.nextToken());
			if (num != 0) {
				queue.add(num);
			} else if (num == 0) {
				if (queue.isEmpty()) {
					sb.append(0).append('\n');
				} else {
					sb.append(queue.poll()).append('\n');
				}
			}

		}
		System.out.println(sb.toString());

	}
}