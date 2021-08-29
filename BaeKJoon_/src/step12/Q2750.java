package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2750 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int array[] = new int[num];
		//��� ����
		boolean count[] = new boolean[2001]; //�������� ������ 1,000���� �۰ų� ���� ����.
				
		for(int i=0; i<num; i++) {
			count[Integer.parseInt(br.readLine()) + 1000] = true;
			// +1000�� ����: -1,000 ~ 1,000
		}
		
		
		for(int i=0; i<count.length; i++) {
			//�������� ���� �ߺ� ��� X
			if(count[i]) {
				System.out.println(i-1000);
			}
			/*
			 * ���� ���� �ߺ��� ���� ���.
			 * for(int j=0; j<count[i];j++){
			 * System.out.println("%d", i);
			 * }
			 */
		}
		
	}
	
}
/*
 * # ���� ���� (Selection Sort)
 * -> ���� ���� �����͸� ������ �� �տ� �ִ� �����Ϳ� �ٲٰ�, �� ���� ���� �����͸� ������ �տ��� �� ��° �����Ϳ� �ٲٴ� ����.
 * -> �ð� ���⵵: O(N��)
 *  
 * # ���� ���� (Insertion Sort)
 * -> �����͸� �ϳ��� Ȯ���Ͽ�, �� �����͸� ������ ��ġ�� �����Ѵ�.(�ʿ��� ���� ��ġ�� �ٲ�)
 * -> �ð� ���⵵: O(N��)
 * 
 * # �� ���� (Quick Sort)
 * -> ����(�ǹ�)�� ������ ���� ū ���� ���� ���� ��ȯ�� ��, ����Ʈ�� ������ ������ ������� ������.
 * -> ȣ��(Hoare) ���� ���: ����Ʈ���� ö ��° �����͸� �ǹ����� ���Ѵ�.
 * -> �ð� ���⵵: O(NlogN)�̰�, �־��� ��� O(N��)
 * 
 * # ��� ���� (Count Sort)
 * -> Ư���� ������ ������ ���� ����� �� �ִ� �ſ� ���� ���� �˰���.
 * -> ����: �������� ũ�� ������ ���ѵǾ� ���� ���·� ǥ���� �� ���� ���� ����.
 * -> �ð� ���⵵:  O(N+K) (N:�������� ���� / K: ������ �� �ִ�) 
 * */
