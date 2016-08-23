import java.util.Scanner;

public class Rev{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	StringBuffer sb=new StringBuffer();
	String str=sc.nextLine();
	sb.append(str);
	System.out.println(sb.reverse());
}
}