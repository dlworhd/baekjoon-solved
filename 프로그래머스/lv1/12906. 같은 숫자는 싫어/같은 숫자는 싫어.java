import java.util.*;

public class Solution {
	public static int[] solution(int []arr) {
		if(arr.length < 1){
			return null;
		}
		int[] answer = {};

		List<Integer> list = new ArrayList();
		list.add(arr[0]);
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[i - 1]){
				list.add(arr[i]);
			}
		}

		answer = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i).intValue();
		}

		return answer;

	}


}
