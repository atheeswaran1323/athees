package forloop;

public class FindAverage {
	public static void main (String[]args) {
		int total=0;
		int count=0; 
		for(int i=1;i<=50;i++) {
			total=total+i;
			count=count+1;

		}
		System.out.println("total value is "+total);
		System.out.println("count value is "+count);
		System.out.println("average value is "+(total/count));
	}

}
