import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int hour = scan.nextInt();
		int min = scan.nextInt();
		int timer = scan.nextInt();
		int count = min + timer;
		
		
		while(count>=60) {
			count -= 60;
			hour += 1;
		}
		
		while (hour>=24) {
			hour -= 24;
		}
		System.out.println(hour+" "+count);

	}

}
