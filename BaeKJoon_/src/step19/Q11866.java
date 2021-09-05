package step19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q11866 {
//offer: µÚ¿¡ ÀúÀå
//poll: ¾Õ ²¨³¿.

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> queue = new LinkedList<>();
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=N; i++) {
			queue.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(queue.size()>1) {
			for(int i=0; i<M-1; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll()).append(", ");
		}
		sb.append(queue.poll()).append(">");
		System.out.println(sb);
	}

}
