package step16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q11399 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int count = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int Time[] = new int[count];
		for(int i=0; i<count; i++) {
			Time[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(Time);
		
		int prev = 0;
		int sum = 0;
		for(int j=0; j<count; j++) {
			prev += Time[j];
			sum += prev;
		}
		System.out.println(sum);
		
	}

}
