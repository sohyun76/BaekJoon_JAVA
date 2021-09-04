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
//������ �ð��� ���� ���� �ֺ��� (����ð����� �����ϱ�)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int Time[][] = new int[count][2];
		
		for(int i =0; i<count;i++) {
			st = new StringTokenizer(br.readLine()," ");
			Time[i][0] = Integer.parseInt(st.nextToken()); //start
			Time[i][1] = Integer.parseInt(st.nextToken()); //end
		}
			//end time �����ϱ�
			Arrays.sort(Time, new Comparator<int[]>() {
				
				public int compare(int[] o1, int[] o2) {
					if(o1[1] == o2[1]) {
						return o1[0] - o2[0]; //����� ���� �ٲٱ�.
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
 * - �ַ� �͸� Ŭ������ ���ȴ�.
 * - �⺻���� ���� ����� �������� ������ ������������ ������ �� ���� ����Ѵ�.
 * - ù ��° �Ķ���� < �� ��° �Ķ���� : ���� ����
 * - ù ��° �Ķ���� == �� ��° �Ķ����: 0 ����
 * - ù ��° �Ķ���� > �� ��° �Ķ���� : ��� ���� (�� ��ü�� �ڸ� ����)
 */
