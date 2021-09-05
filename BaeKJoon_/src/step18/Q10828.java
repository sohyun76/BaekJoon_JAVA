package step18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10828 {
	
	static StringBuilder sb;
	static StringTokenizer st;
	public static int stack[];
	public static int size = 0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		sb = new StringBuilder();
		int count = Integer.parseInt(br.readLine());
		stack = new int[count];
		for(int i =0; i<count; i++) {
			st = new StringTokenizer(br.readLine()," ");
			switch(st.nextToken()) {
			case "push":
				push(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				pop();
				break;
			case "size":
				size();
				break;
			case "empty":
				empty();
				break;
			case "top":
				top();
				break;
			}
		}
		
		System.out.println(sb);
		
	}
	
	public static void push(int num) {
		stack[size] = num;
		size++;
	}
	
	public static void pop() {
		if(size == 0 ) {sb.append("-1");
		}
		else {
			int num = stack[size-1];
			stack[size-1] = 0;
			size--;
			sb.append(num);
		}
		sb.append("\n");
	}
	public static void size() {
		sb.append(size);
		sb.append("\n");
	}
	public static void empty() {
		if(size==0) {sb.append("1");}
		else {sb.append("0");}
		sb.append("\n");
	}
	public static void top() {
		if(size==0) {sb.append("-1");}
		else {sb.append(stack[size-1]);}
		sb.append("\n");
	}
}


