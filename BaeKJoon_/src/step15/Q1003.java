package step15;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1003 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int counts = Integer.parseInt(br.readLine());
		
		for(int i=0; i<counts; i++) {
			int num = Integer.parseInt(br.readLine());
			fibona(num);
		}
		
	}
	
	
	private static void fibona(int num) {
		int zero = 1;
		int one = 0;
		int sum = 1;
		
		for(int i=0;i<num;i++) {
			zero = one;
			one = sum;
			sum = zero+one;
		}
		System.out.println(zero+" "+one);
	}

}

