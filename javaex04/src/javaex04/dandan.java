package javaex04;

public class dandan {

	public static void main(String[] args) {
		
		int dan1;
		int dan2;
		
		for(dan1=2; dan1<10; dan1++) {
			if (dan1%2 ==0) {
				continue;
			}else {
				for (dan2=1; dan2<10; dan2++ ) {
					System.out.println(dan1+"x"+dan2+"="+dan1*+dan2 );
				}
			}
				
			
			
		}

	}

}
