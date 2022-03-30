package javaex04;

public class switchex1 {

	public static void main(String[] args) {
	int ranking=2;
	char madalColor;
		
	switch(ranking) {
	case 1: madalColor ='g';
			break;
	case 2: madalColor ='s';
			break;
	case 3: madalColor = 'b';
			break;
	default:
		madalColor='a';
	
	}
	System.out.println(ranking+"등 메달의 색깔은"+ madalColor +"입니다.");	
		
	}

}
