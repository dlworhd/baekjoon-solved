class Solution {
  public String solution(String rsp) {
		String answer = "";
		StringBuilder sb = new StringBuilder(answer);
		for (int i = 0; i < rsp.length(); i++) {
			if (rsp.charAt(i) == '2') {
				sb.append("0");
			} else if (rsp.charAt(i) == '0') {
				sb.append("5");
			} else {
				sb.append("2");
			}
		}
		return sb.toString();
	}
}