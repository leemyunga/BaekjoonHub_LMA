import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		int[] narray = new int[n];
		for(int i=0 ; i<n; i++) {
			narray[i] = scanner.nextInt();
		}
		
		int min =narray[0];
		int max= narray[0];

		for(int i=0 ; i<n; i++) {
			if(narray[i]<min) {
				min = narray[i];
			}
			if(narray[i]>max) {
				max = narray[i];
			}
			
		}
		
		System.out.print(min + " " + max);
		

		
	}
}