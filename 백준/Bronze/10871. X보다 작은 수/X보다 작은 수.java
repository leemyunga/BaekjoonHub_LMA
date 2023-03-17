import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int x = scanner.nextInt();
		
		int[] narray = new int[n];
		for(int i=0 ; i<n; i++) {
			narray[i] = scanner.nextInt();
		}
		

		for(int i=0 ; i<n; i++) {
			if(narray[i]<x) {
				System.out.print(narray[i] + " ");
			}
		}
	}
}
