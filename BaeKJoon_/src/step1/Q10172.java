package step1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q10172 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = "|\\_/|\n"
				+ "|q p|   /}\n"
				+ "( 0 )\"\"\"\\\n"
				+ "|\"^\"`    |\n"
				+ "||_/=\\\\__|";
		bw.write(a);
		bw.flush();
		bw.close();
	}
}
