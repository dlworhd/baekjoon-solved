import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st1 = new StringTokenizer(br.readLine());


		// 총 문제 갯수
		int n = Integer.parseInt(st1.nextToken());
		// 맞혀야 하는 갯수
		int m = Integer.parseInt(st1.nextToken());
		// 해시 맵 등록
		Map<String, Integer> hashMap = new HashMap<>();
		String[] strArr = new String[n + 1];


		StringTokenizer st2;

		// 해시 맵에 도감 저장
		for (int i = 1; i <= n; i++) {
			st2 = new StringTokenizer(br.readLine());
			String str = st2.nextToken();
			hashMap.put(str, i);
			strArr[i] = str;
		}

		StringTokenizer st3;
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= m; i++) {
			st3 = new StringTokenizer(br.readLine());
			String str = st3.nextToken();

			if(Main.isStringNumber(str)){
				sb.append(strArr[Integer.parseInt(str)]);
			} else {
				sb.append(hashMap.get(str));
			}
			sb.append('\n');
		}
		sb.delete(sb.length() - 1, sb.length());
		System.out.println(sb.toString());

	}

	public static boolean isStringNumber(String s) {
		try {
			Double.parseDouble(s);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
}
