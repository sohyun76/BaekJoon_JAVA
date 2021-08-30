package step15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003_1 {

	public static Integer[][] dp = new Integer[41][2];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		dp[0][0] = 1; // N=0일 때의 0 호출 횟수
		dp[0][1] = 0; // N=0일 때의 1 호출 횟수
		dp[1][0] = 0;
		dp[1][1] = 1;
		
		int count = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<count; i++) {
			int num = Integer.parseInt(br.readLine());
			fibonacci(num);
			sb.append(dp[num][0]+" "+dp[num][1]).append("\n");
		}
		
		System.out.println(sb);
	}
	
	public static Integer[] fibonacci(int num) {
		if(dp[num][0]==null || dp[num][0] == null) {
		dp[num][0] = fibonacci(num-1)[0] + fibonacci(num-2)[0];
		dp[num][1] = fibonacci(num-1)[1] + fibonacci(num-2)[1];
		}
		
		return dp[num];
	}

}
