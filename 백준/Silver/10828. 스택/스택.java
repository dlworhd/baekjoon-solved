import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	static int[] stack;
	static int ptr = 0;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int n = Integer.parseInt(br.readLine());
		stack = new int[n];

		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			switch (st.nextToken()){
				case "push":
					push(Integer.parseInt(st.nextToken()));
					break;
				case "pop":
					System.out.println(pop());
					break;
				case "top":
					System.out.println(top());
					break;
				case "size":
					System.out.println(size());
					break;
				case "empty":
					System.out.println(empty());
					break;
			}

		}


	}
	static void push(int number){
		stack[ptr++] = number;
	}

	static int pop(){
		if(ptr == 0){
			return -1;
		} else {
			int temp = ptr - 1;
		    ptr--;
	        return stack[temp];
		}
	}

	static int top(){
		if(ptr == 0){
			return -1;
		} else {
			return stack[ptr - 1];
		}

	}

	static int empty(){
		if(ptr == 0){
			return 1;
		} else {
			return 0;
		}
	}

	static int size(){
		return ptr;
	}


}