import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		Map<String, Integer> map = new HashMap<>();
		int cnt = 0;

		StringTokenizer st2;

		for (int i = 0; i < n; i++) {
			st2 = new StringTokenizer(br.readLine());
			String str = st2.nextToken();
			map.put(str, i + 1);
		}

		StringTokenizer st3;
		for (int i = 0; i < m; i++) {
			st3 = new StringTokenizer(br.readLine());
			String str = st3.nextToken();
			if(map.containsKey(str)){
				cnt++;
			}
		}
		System.out.println(cnt);


	}
}
