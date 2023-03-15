import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		
		int first = b/100;
		//System.out.println(first);
		
		int second = (b-first*100)/10;
		//System.out.println(second);
		
		int third = (b-first*100-second*10);
		//System.out.println(third);
		
		System.out.println(a*third);
		System.out.println(a*second);
		System.out.println(a*first);
		System.out.println(a*b);
	}

}