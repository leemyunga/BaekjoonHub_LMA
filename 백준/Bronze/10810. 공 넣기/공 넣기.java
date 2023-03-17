
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// N개의 바구니, N*M개의 공, M번의 행위
		// N : 바구니 갯수
		// M : 행위 횟수 
		
		
		Scanner sc = new Scanner(System.in);
		
		String firstLine = sc.nextLine();
		int N = Integer.parseInt(firstLine.split(" ")[0]);
		int M = Integer.parseInt(firstLine.split(" ")[1]);
		
		int[] arr = new int[N];
		
		for (int i = 0; i < N; i++) {
			arr[i] = 0;
			//System.out.print("arr[" + i + "] : " +arr[i] + "  ");
		}
		
				// i : i번 바구니 부터  
				// j : j번 바구니 까지
				// k : k번호의 공을 넣는다. 
		
		for (int chance = 0; chance < M; chance++) {
			
			String secondLine = sc.nextLine();
			int i = Integer.parseInt(secondLine.split(" ")[0]);
			int j = Integer.parseInt(secondLine.split(" ")[1]);
			int k = Integer.parseInt(secondLine.split(" ")[2]);
			
			for(int input = i-1; input <j; input++) {
				arr[input] = k;
			}
			
		}
		
		for (int index = 0; index < N; index++) {
			System.out.print(arr[index] +" ");
		}
		
		// 1번 바구니부터 N번 바구니까지 출력 공이 있다면 1 없다면 0
	}

}
