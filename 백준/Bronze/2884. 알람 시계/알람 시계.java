import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	    int H = scanner.nextInt();
	    int M = scanner.nextInt();
	    int tmp;
	    if(H==0) {
	    	H = 24;
	    }
	    
	    tmp = (H*60) + M - 45;
	    
	    
	    H = tmp/60;
	    M = tmp%60;
	    
	    if(H==24) {
	    	H = 0;
	    }
	    
	    System.out.print(H);
	    System.out.print(" ");
	    System.out.print(M);
	}

}