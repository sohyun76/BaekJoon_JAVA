package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Q1931 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//끝나는 시간이 제일 빠른 애부터 (종료시간으로 정렬하기)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int Time[][] = new int[count][2];
		
		for(int i =0; i<count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			Time[i][0] = Integer.parseInt(st.nextToken()); //start
			Time[i][1] = Integer.parseInt(st.nextToken()); //end
		}
			//end time 정렬하기
			Arrays.sort(Time, new Comparator<int[]>() {
				
				public int compare(int[] o1, int[] o2) {
					if(o1[1] == o2[1]) {
						return o1[0] - o2[0]; //양수면 서로 바꾸기.
					}
					return o1[1] - o2[1];
				}
			});
			
			int num = 0;
			int prev_end_time = 0;
			
			for(int j=0; j<count; j++) {
				if(prev_end_time <= Time[j][0]) {
					prev_end_time = Time[j][1];
					num++;
				}
			}
			System.out.println(num);
		}
		
	}



/*
 * # Interface Comparator
 * - 주로 익명 클래스로 사용된다.
 * - 기본적인 정렬 방법인 오름차순 정렬을 내림차순으로 정렬할 때 많이 사용한다.
 * - 첫 번째 파라미터 < 두 번째 파라미터 : 음수 리턴
 * - 첫 번째 파라미터 == 두 번째 파라미터: 0 리턴
 * - 첫 번째 파라미터 > 두 번째 파라미터 : 양수 리턴 (두 객체의 자리 변경)
 */
