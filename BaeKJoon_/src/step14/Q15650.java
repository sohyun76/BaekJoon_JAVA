package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15650 {

	public static int N; //정적변수로 설정.
	public static int M;
	public static int[] array;
	public static boolean[] visited;
	public static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//문제 조건: (1 ≤ M ≤ N ≤ 8)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		sb = new StringBuilder();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		array = new int[M];
		visited = new boolean[N];
		
		backTracking(0,0);
		System.out.println(sb);
		

	}
	
	public static void backTracking(int depth, int start) {
		if(depth>=M) {
			for(int num:array) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		else {
			for(int i=start; i<N; i++) {
				if(!visited[i]) {
					visited[i] = true;
					array[depth] = i+1;
					backTracking(depth+1, i+1);
					visited[i] = false;
				}
			}
		}
	}

}
