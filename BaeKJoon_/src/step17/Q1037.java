package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q1037 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int []array = new int[count];
		
		for(int i=0; i<count; i++) {
			array[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(array);
		System.out.println(array[0]*array[count-1]);
		
	}

}
