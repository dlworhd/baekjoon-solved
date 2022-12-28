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

		while (true) {
			if(queue.size() > 1) {
				queue.poll();

				int p = queue.poll();
				queue.add(p);
				if (queue.size() == 1) {
					System.out.println(queue.peek());
					break;
				}
			} else if(queue.size() == 1){
				System.out.println(1);
				break;
			}
		}
	}
}