package forloop;

public class FindingFactorial {
	public static void main(String[]args) {
		int fact=1;
		int num=15;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
			System.out.println("factorial of "+i+" is "+fact);
			
		}
	}

}
