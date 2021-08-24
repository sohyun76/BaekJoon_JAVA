package step4;

import java.util.Scanner;

public class Q10951 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//hasNextInt(): Scanner 객체에 입력값이 int값일 때만 true를 반환
		while(sc.hasNextInt()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}

}
