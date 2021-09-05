package step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q18258 {

	static int queue[];
	static int size = 0;
	static int front = 0; //index
	static int back = 0;  //index
	static StringTokenizer st;
	static StringBuilder sb= new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		queue = new int[count];
		
		while(count-- >0) {
			String str = br.readLine();
			st = new StringTokenizer(str," ");
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
			case "front":
				front();
				break;
			case "back":
				back();
				break;
			}
		}
		System.out.print(sb);
	}
	
	public static void push(int num) {
		queue[back] = num;
		back++;
		size++;
	}
	public static void pop() {
		if(size==0) {sb.append("-1");}
		else {
			int num = queue[front];
			front++;
			size--;
			sb.append(num);
		}
		sb.append("\n");
	}
	public static void size() {
		sb.append(size).append('\n');
	}
	public static void empty() {
		if(size==0) {sb.append("1").append('\n');}
		else {sb.append("0").append('\n');}
	}
	public static void front() {
		if(size==0) {sb.append("-1").append('\n');}
		else {
			sb.append(queue[front]).append('\n');
		}
	}
	public static void back() {
		if(size==0) {sb.append("-1").append('\n');}
		else {
			sb.append(queue[back-1]).append('\n');
		}
	}

}

/*
 * 1)LinkedList는 Deque(Queue를 상속받고 있음)도 구현하고 있기 때문에
 * LinkedList로 선언해주어 사용할 수 있다.
 * 2) Deque<Integer> q = new LinkedList<>();
 * 3) Deque<Integer> q = new ArrayDeque<>();
 * - 메소드 (1,2,3 동일)
 * q.offer();	// push
 * q.pop();	// pop
 * q.size();	// size
 * q.isEmpty();	// empty
 * q.peek();	// front
 * q.peekLast();	// back
 */