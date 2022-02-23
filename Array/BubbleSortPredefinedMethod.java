package ArrayExample;

import java.util.Arrays;

public class BubbleSortPredefinedMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[]= {18,19,13,12,15,17,16};
		
		Arrays.sort(num);
		
		System.out.print(Arrays.toString(num));
	}

}
/*
output
[12, 13, 15, 16, 17, 18, 19]
*/