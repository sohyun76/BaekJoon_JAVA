package step5;

import java.util.Scanner;

public class Q2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int max = 0;
		int index = 0;
		
		Scanner sc = new Scanner(System.in);
		for(int i=1;i<10;i++) {
			int a = sc.nextInt();
			if(max<a) {
				max = a;
				index = i;
			}
			
		}
		sc.close();
		System.out.println(max);
		System.out.println(index);
	}

}
