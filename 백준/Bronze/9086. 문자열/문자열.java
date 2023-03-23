import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = Integer.parseInt(sc.nextLine());
		String[] word = new String[T];
		
		char[] cut = new char[2];
		String[] str = new String[T];
		
		for (int i = 0; i < T; i++) {
			word[i] = sc.nextLine();
			cut[0] = word[i].charAt(0);
			cut[1] = word[i].charAt(word[i].length()-1);
			String cc = new String(cut);
			str[i] = cc;
		}
		
		for (int i = 0; i < T; i++) {
			System.out.println(str[i]);
		}
	
		
	}
}