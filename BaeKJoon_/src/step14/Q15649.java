package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15649 {

	//N 과 M 정적변수로 설정.
	public static int N;
	public static int M;
	public static int[] array;
	public static boolean[] visited;
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		
		
		array = new int[M];
		visited = new boolean[N];
		
		backTracking(0);
		System.out.println(sb);
	}
	
	public static void backTracking(int depth) {
		if(depth == M) {
			//더이상 내려갈 곳 없어.
			for(int num: array) {
				sb.append(num).append(" ");
			}
			sb.append("\n");
			return;
		}
		
		//else
		for(int i=0; i<N; i++) {
			if(!visited[i]) {
				visited[i] = true;
				array[depth] = i+1;
				//다음 depth로 가기
				backTracking(depth+1);
				visited[i] = false;
			}
		}
	}

}

/*
 * # 백트래핑
 * -> '가능한 모든 방법을 탐색한다.'
 * -> DFS(깊이 우선 탐색)에서 가지치기(Pruning)을 통해 가도되지 않는 루트는 고려하지 않고 탐색하는 완전탐색 기법.
 * -> 보통 의사 결정, 최적화, 열거하기 등에 사용하며, 대부분은 Dynamic Programming, 그리디 알고리즘 등으로 더 빠른 해결 가능.
 * -> 대표적인 예시: N-Queen
 * 
 * */
