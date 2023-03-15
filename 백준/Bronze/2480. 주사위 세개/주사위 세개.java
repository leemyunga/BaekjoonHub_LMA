import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int money = 0;
		
		
		if((a==b)&&(b==c)) {
			money = 10000 + a*1000 ;
		}else if((a!=b)&&(b!=c)&&(a!=c)) {
			int temp=0;
			if(temp<a) {
				temp=a;
			}
			if(temp<b) {
				temp = b;
			}
			if(temp<c) {
				temp = c;
			}
			money = temp*100 ;
		}else {
			if(a==b) {
				money =1000 + a*100 ;
			}
			if(c==b) {
				money = 1000 + c*100 ;
			}
			if(a==c) {
				money = 1000 + a*100 ;
			}
		}
		
		System.out.println(money);
	}

}
