import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 9;
		
		int[] narray = new int[n];
		for(int i=0 ; i<n; i++) {
			narray[i] = scanner.nextInt();
			//System.out.println();
		}
		
		int max= narray[0];
		int num = 1;

		for(int i=0 ; i<n; i++) {
			
			if(narray[i]>max) {
				max = narray[i];
				num=i+1;
			}
			
		}
		
		System.out.println(max);
		System.out.print(num);
		

		
	}
}