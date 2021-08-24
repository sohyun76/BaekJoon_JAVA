package step2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2884 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str," ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		br.close();
		int C = 45;
	
		if(M>=45) {
			if(H==0) {
				System.out.println("0 "+(M-C));
			}
			else {
				System.out.println(H+" "+(M-C));
			}
		}
		else {
			if(H==0) {
				System.out.println("23 "+(60+M-C));
			}
			else {
				System.out.println((H-1)+" "+(60+M-C));
			}
		}
	}

}
