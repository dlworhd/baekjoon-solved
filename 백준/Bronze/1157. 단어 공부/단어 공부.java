import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Main{
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] cnt = new int[26];

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                cnt[s.charAt(i) - 'A']++;
            } else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                cnt[s.charAt(i) - 'a']++;
            } else {
                break;
            }

        }

        int max = Integer.MIN_VALUE;
        int idx = 0;
        for(int i = 0; i < cnt.length; i++) {
            if (max < Integer.max(max, cnt[i])) {
                max = Integer.max(max, cnt[i]);
                idx = i;
            }
        }
        int cntNum = 0;

        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] == max){
                cntNum++;
            }
        }

        if(cntNum > 1){
            System.out.println("?");
        } else if(cntNum == 1){
            System.out.println((char)('A' + idx));
        }

    }
}