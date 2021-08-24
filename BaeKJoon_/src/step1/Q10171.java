package step1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Q10171 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String a = "\\    /\\\n"
				+ " )  ( ')\n"
				+ "(  /  )\n"
				+ " \\(__)|";
		bw.write(a);
		bw.flush();
		bw.close();
	}
}
