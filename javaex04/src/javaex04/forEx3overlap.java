package javaex04;

public class forEx3overlap {

	public static void main(String[] args) {

		int num;
		int num1;
		for (num =1; num <10; num++) {
			for (num1=1; num1<10; num1++) {
				System.out.println(num+"x"+num1+"="+num*num1);
			}
		}
	}

}
