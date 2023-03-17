import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int[] narray = new int[n];
		for(int i=0 ; i<n; i++) {
			narray[i] = scanner.nextInt();
		}
//		for(int i=0 ; i<n; i++) {
//			System.out.print(narray[i]+" ");
//		}
		
		int v = scanner.nextInt();
		int vnum=0;
		for(int i=0 ; i<n; i++) {
			if(narray[i]==v) {
				vnum = vnum + 1;
			}
		}
		System.out.print(vnum);

	}

}