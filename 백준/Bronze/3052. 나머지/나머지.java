import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 자연수 A, B 
		// A%B 는 나머지.
		
		// 10개를 입력 받은 뒤 이를 42로 나눈 나머지를 구한다. 
		
		int[] arr = new int[10];
		
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(sc.nextLine())%42;
		}
		
		int cnt = 10;
		
		// arr[1]의 값을 arr[]값과 비교
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				
				if(arr[i]==arr[j]) {
					cnt -= 1;
					break;
				};
			}
		}
		
		
		System.out.println(cnt);
	}
}