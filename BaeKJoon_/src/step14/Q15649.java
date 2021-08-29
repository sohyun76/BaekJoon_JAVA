package step14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q15649 {

	//N �� M ���������� ����.
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
			//���̻� ������ �� ����.
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
				//���� depth�� ����
				backTracking(depth+1);
				visited[i] = false;
			}
		}
	}

}

/*
 * # ��Ʈ����
 * -> '������ ��� ����� Ž���Ѵ�.'
 * -> DFS(���� �켱 Ž��)���� ����ġ��(Pruning)�� ���� �������� �ʴ� ��Ʈ�� ������� �ʰ� Ž���ϴ� ����Ž�� ���.
 * -> ���� �ǻ� ����, ����ȭ, �����ϱ� � ����ϸ�, ��κ��� Dynamic Programming, �׸��� �˰��� ������ �� ���� �ذ� ����.
 * -> ��ǥ���� ����: N-Queen
 * 
 * */
