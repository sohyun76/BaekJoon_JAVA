package step1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2588 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//String str = br.readLine();
		//StringTokenizer st = new StringTokenizer(str," ");
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		
		br.close();
		StringBuilder sb = new StringBuilder();
		sb.append(a*(b%10));
		sb.append("\n");
		sb.append(a*((b%100)/10));
		sb.append("\n");
		sb.append(a*(b/100));
		sb.append("\n");
		sb.append(a*b);
		System.out.print(sb);


	}
}
