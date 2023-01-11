import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {


		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> map;

		int cnt = 1;
		while (true) {
			map = new HashMap<>();
			int edge = 0;

			while (true) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				if (start == -1 && end == -1) { // 입력 끝
					return;
				} else if (start == 0 && end == 0) { //테스트 케이스 하나 끝
					break;
				}
				map.put(start, map.getOrDefault(start, 0));
				map.put(end, map.getOrDefault(end, 0) + 1);
				edge++;
			}

			int root = 0;
			boolean isTrue = true;


			for (Integer integer : map.keySet()) {
				if (map.get(integer) == 0) {
					root++;
				} else if (map.get(integer) > 1) {
					isTrue = false;
					break;
				}
			}


			if (map.size() == 0) {
				System.out.println("Case " + cnt + " is a tree.");
			} else if (isTrue && root == 1 && edge == map.size() - 1) {
				System.out.println("Case " + cnt + " is a tree.");
			} else {
				System.out.println("Case " + cnt + " is not a tree.");
			}
			cnt++;
		}
	}
}