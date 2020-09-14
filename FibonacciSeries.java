package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		//fibonacciseries
		int m1 =0;
		int m2 =1;
		int m3;
		System.out.println(m1);
		System.out.println(m2);
		
		
		
		for(int i = 4; i <=8; i++) {
			
			
			m3=m1+m2;
			System.out.println(m3);
           m1=m2;
           m2=m3;
		}
		
	}

}
