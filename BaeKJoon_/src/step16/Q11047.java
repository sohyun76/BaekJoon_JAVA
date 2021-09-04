package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q11047 {
//�׸��� �˰���: �� ���� �������� �ּ��̶�� �����ϴ� �������� �����ϴ� ����� �˰���.
// ���� ���α׷��ֺ��� ����.
	//hint: ���� �Է��� �� 5�� �����.
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
//�ڸ��� ���� 5�� ����..
		
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
