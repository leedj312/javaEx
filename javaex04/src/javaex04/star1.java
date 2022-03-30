package javaex04;

public class star1 {

	public static void main(String[] args) {
		int num;
		int num2;
		char s='*';
		
		for (num=1; num <=7; num++ ) {
			for (num2=1; num2 <=num; num2++ ) {
				System.out.print(s);
			}
			
			System.out.println();
		}
		

	}
}

