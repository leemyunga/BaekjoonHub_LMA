import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		int x = N/4;
		StringBuffer buffer = new StringBuffer();
		
		for (int i = 1; i < x; i++) {
			buffer.append("long ");
		}
		
		buffer.append("long int");
		
		System.out.println(buffer);
		sc.close();

	}

}
