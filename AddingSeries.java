package forloop;

public class AddingSeries {
	public static void main(String[]args) {
		int total=0;
		int total1=0;
		for(int i=1;i<=5;i++) {
			total=total+i;
			total1=total1+total;
			System.out.println(total1);
			
		}
	}

}
