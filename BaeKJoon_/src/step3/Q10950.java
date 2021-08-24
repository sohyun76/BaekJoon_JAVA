package step3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q10950 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// ctrl shift m -> ÀÚµ¿ import
		int count = Integer.parseInt(br.readLine());
		int num = 0;
		
		while(num < count){
			String aa = br.readLine();
			StringTokenizer st = new StringTokenizer(aa," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			System.out.println(a+b);
			
			num++;
		}
		
	}

}
