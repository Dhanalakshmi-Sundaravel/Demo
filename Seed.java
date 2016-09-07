import java.util.Scanner;
public class Seed {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int sum=n,r;
	while(n!=0)
	{
		r=n%10;
		sum=sum*r;
		n=n/10;
	}
	System.out.println("seed value  is "+sum);
	
}
}
