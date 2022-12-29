import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		Deque deque = new ArrayDeque();
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String s = st.nextToken();
			switch (s) {
				case "push_back":
					deque.addLast(Integer.parseInt(st.nextToken()));
					break;
				case "push_front":
					deque.addFirst(Integer.parseInt(st.nextToken()));
					break;

				case "front":
					if (deque.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(deque.getFirst()).append('\n');
					}
					break;
				case "back":
					if (deque.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(deque.getLast()).append('\n');
					}
					break;
				case "size":
					sb.append(deque.size()).append('\n');
					break;

				case "empty":
					if (deque.isEmpty()) {
						sb.append(1).append('\n');
					} else {
						sb.append(0).append('\n');
					}
					break;

				case "pop_front":
					if (deque.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(deque.pollFirst()).append('\n');
					}
					break;

				case "pop_back":
					if (deque.isEmpty()) {
						sb.append(-1).append('\n');
					} else {
						sb.append(deque.pollLast()).append('\n');
					}
					break;
			}
		}
		System.out.println(sb.toString());
	}
}
