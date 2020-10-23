//program for printing fibbonacci series
import java.util.Scanner;

public class FibboSeries{
	public static void main(String[] vals){
		
		System.out.println("Enter a number for outer range of fibbonacci series");
		
		Scanner scan = new Scanner(System.in);
		int fibboend = scan.nextInt();
		
		int left=0,right=1,futureRight=0;
		
		if(fibboend>0)
		System.out.print(left+", ");
		
		for(int i=0;i<fibboend-1;i++) {
			futureRight = left + right;
			left = right;
			right = futureRight;
			System.out.print(left+", ");
		}
		System.out.println();
		System.out.println("Completely executed");
	}
}