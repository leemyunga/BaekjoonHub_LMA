import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		StringBuffer sbuffer = new StringBuffer();
		
		for (int i = 0; i < T; i++) {
			String line = br.readLine();
			String[] arr = line.split(" ");
			int A = Integer.parseInt(arr[0]);
			int B = Integer.parseInt(arr[1]);
			sbuffer.append("Case #"+(i+1)+": "+(A+B)+"\n");
		}
		System.out.println(sbuffer);
		br.close();

	}

}
