package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047 {
//그리디 알고리즘: 그 순간 순간마다 최선이라고 생각하는 방향으로 결정하는 방식의 알고리즘.
// 동적 프로그래밍보다 빠름.
	//hint: 예제 입력이 다 5의 배수임.
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//자릿수 별로 5로 나눠..
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		StringTokenizer st = new StringTokenizer(a," ");
		int num = Integer.parseInt(st.nextToken());
		int price = Integer.parseInt(st.nextToken());
		int coin[] = new int[num];
		for(int i=0; i<num; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		int sum = 0;
		for(int k=num-1; k>=0; k--) {
			if(coin[k]<=price) {
				sum += price/coin[k];
				price = price%coin[k];
			}
		}
		
		System.out.println(sum);
		
	}
	
	
}
