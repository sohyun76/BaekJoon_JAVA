package step18;

import java.util.Scanner;

public class Q10773 {

	public static int stack[];
	public static int size = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		stack = new int[count];
		while(count-- >0) {
			int num = sc.nextInt();
			if(num==0) {
				stack[size-1] = 0;
				size--;
			}
			else {
				stack[size] = num;
				size++;
			}
		}
		int sum = 0;
		for(int i=0; i<size; i++) {
			sum += stack[i];
		}
		System.out.println(sum);
	}

}
