import java.util.Arrays;
import java.util.Scanner;

public class DecreasingOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		String[] arr1=new String[n];
		for (int i = 0; i < n; i++) {
			arr1[i]=Integer.toBinaryString(sc.nextInt());
			arr[i]=Integer.parseInt(arr1[i],2);
		}
		Arrays.sort(arr1);
		
		for (int i = arr1.length-1; i >=0 ; i--) {
			//System.out.println((arr1[i]));
			System.out.println(Integer.parseInt(arr1[i],2));
		}
		
	}

}
