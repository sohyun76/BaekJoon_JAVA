package step5;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Q10818 {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		
		String aa = br.readLine();
		String []tokens = aa.split(" ");
		
		int[] nums = Arrays.stream(tokens).mapToInt(Integer::parseInt).toArray();
		int min = nums[0];
		int max = nums[0];
		
		if(num==nums.length) {
			for(int i=0;i<nums.length;i++) {
				if (min> nums[i]) {
					min = nums[i];
				}
				if (nums[i]>max) {
					max = nums[i];
				}
			}
		}
		System.out.println(min+" "+max);
	}

}
