package javaex04;

public class forEx4Continue {

	public static void main(String[] args) {
		int total =0;
		int num;
		
		for (num=1; num <=100; num++) {
			if (num %2 ==0) {
				continue;
			}
			System.out.println(num);
		}
		
		
	}

}
