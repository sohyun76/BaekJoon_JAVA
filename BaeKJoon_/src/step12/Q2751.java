package step12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Q2751 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// �����Լ� Collections �Ẹ��
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		//int array[] = new int[count];
		ArrayList<Integer> array = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0; i<count; i++) {
			array.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(array);
		
		for(int num:array) {
			sb.append(num+"\n");
		}
		System.out.print(sb);
		
	}

}
