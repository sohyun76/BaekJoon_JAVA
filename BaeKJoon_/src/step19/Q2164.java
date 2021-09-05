package step19;

import java.util.Scanner;

public class Q2164 {

	static int front = 0;
	static int back;
	static int size;
	static boolean count = true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cards[] = new int[num*2];
		back = num -1;
		size = num;
		for(int i=0; i<num;i++) {
			cards[i] = i+1;
		}
		while(size >1) {
			if(count) {
				//true이면 카드 버리기.
				front++;
				size--;
				count = false;
			}
			else {
				int card = cards[front];
				front++;
				back++;
				cards[back] = card;
				count = true;
			}
		}
		System.out.println(cards[front]);
	}

}
