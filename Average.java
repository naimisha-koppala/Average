
import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("enter no.of elements");
		int n=0;
		n=s.nextInt();
		System.out.println("enter the elements");
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=s.nextInt();
		}
		s.close();
		if(n==0)
			System.out.println("avg is 0");
		else
			System.out.println("avg is "+ sum/n);

	}

}
