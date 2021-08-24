package step1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q10718 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = "강한친구 대한육군";
		bw.write(a+"\n"+a);
		bw.flush();
		bw.close();
	}
	
}
