import java.util.*;

class Solution {
    public int[] solution(String my_string) {
		int[] answer = {};

		List<Integer> list = new ArrayList<>();

		for(int i = 0; i < my_string.length(); i++){
			if(my_string.charAt(i) >= '0' && my_string.charAt(i) <= '9'){
				list.add(Integer.parseInt(String.valueOf(my_string.charAt(i))));
			}
		}

		Collections.sort(list);

		answer = list.stream().mapToInt(Integer::intValue).toArray();

		return answer;
	}
}