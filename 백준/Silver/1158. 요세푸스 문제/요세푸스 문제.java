
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());

		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		// 간격
		int num = Integer.parseInt(st.nextToken());
		int cnt = 0;

		List<Integer> list = new ArrayList();
		while (true) {
			cnt++;

			if (cnt == num) {
				list.add(queue.poll());
				cnt = 0;
			} else {
				int p = queue.poll();
				queue.add(p);
			}

			if (list.size() == N) {
				break;
			}
		}

		StringBuilder sb = new StringBuilder("<");

		for (int i = 0; i < list.size() - 1; i++) {
			sb.append("" + list.get(i) + ", ");
		}

		sb.append("" + (list.get(list.size() - 1)) + ">");

		System.out.println(sb.toString());
	}
}