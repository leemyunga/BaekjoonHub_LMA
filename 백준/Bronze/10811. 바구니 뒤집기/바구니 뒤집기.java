
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			// N개의 바구니, M번의 행위
				
			Scanner sc = new Scanner(System.in);
				
			String firstLine = sc.nextLine();
			int N = Integer.parseInt(firstLine.split(" ")[0]);
			int M = Integer.parseInt(firstLine.split(" ")[1]);
				
			int[] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = i+1;
			}
			

			for (int chance = 0; chance < M; chance++) {
				
				String secondLine = sc.nextLine();
				
				int i = Integer.parseInt(secondLine.split(" ")[0])-1;
				int j = Integer.parseInt(secondLine.split(" ")[1])-1;
								
				while(i<=j) {
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	                i++;
	                j--;   
	            }
			}
			
			for (int i = 0; i < N; i++) {
				System.out.print(arr[i] + " ");
			}
				
	}

}
