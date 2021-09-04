package step17;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		while(true) {
			String str = br.readLine();
			if(str.equals("0 0")) {
				break;
			}
			st = new StringTokenizer(str," ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			//if((a/b <=1)&&(b%a==0)) 이것만 해도 돼.
			if(b%a==0){
				System.out.println("factor");
				
			}
			
			else if(a%b==0) {
				System.out.println("multiple");
			}
			else {
				System.out.println("neither");
			}
		}
	}

}
