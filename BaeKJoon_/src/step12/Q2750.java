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
		//계수 정렬
		boolean count[] = new boolean[2001]; //문제에서 절댓값이 1,000보다 작거나 같은 정수.
				
		for(int i=0; i<num; i++) {
			count[Integer.parseInt(br.readLine()) + 1000] = true;
			// +1000한 이유: -1,000 ~ 1,000
		}
		
		
		for(int i=0; i<count.length; i++) {
			//문제에서 숫자 중복 허용 X
			if(count[i]) {
				System.out.println(i-1000);
			}
			/*
			 * 만약 숫자 중복이 허용될 경우.
			 * for(int j=0; j<count[i];j++){
			 * System.out.println("%d", i);
			 * }
			 */
		}
		
	}
	
}
/*
 * # 선택 정렬 (Selection Sort)
 * -> 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸고, 그 다음 작은 데이터를 선택해 앞에서 두 번째 데이터와 바꾸는 과정.
 * -> 시간 복잡도: O(N²)
 *  
 * # 삽입 정렬 (Insertion Sort)
 * -> 데이터를 하나씩 확인하여, 각 데이터를 적절한 위치에 삽입한다.(필요할 때만 위치를 바꿈)
 * -> 시간 복잡도: O(N²)
 * 
 * # 퀵 정렬 (Quick Sort)
 * -> 기준(피벗)을 설정한 다음 큰 수와 작은 수를 교환한 후, 리스트를 반으로 나누는 방식으로 동작함.
 * -> 호어(Hoare) 분할 방식: 리스트에서 철 번째 데이터를 피벗으로 정한다.
 * -> 시간 복잡도: O(NlogN)이고, 최악의 경우 O(N²)
 * 
 * # 계수 정렬 (Count Sort)
 * -> 특정한 조건이 부합할 때만 사용할 수 있는 매우 빠른 정렬 알고리즘.
 * -> 조건: 데이터의 크기 범위가 제한되어 정수 형태로 표현할 수 있을 때만 가능.
 * -> 시간 복잡도:  O(N+K) (N:데이터의 개수 / K: 데이터 중 최댓값) 
 * */
