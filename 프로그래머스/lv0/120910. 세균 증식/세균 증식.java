class Solution {
    public int solution(int n, int t) {
        int answer = n;
        
        // n이 주어짐 시간 10이 주어지면 10번 동안 2*= x를 하면 됨
        
        for(int i = 0; i < t; i++){
            answer *= 2;
        }
        
        return answer;
    }
}