

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 첫번째 줄의 숫자를 입력 받아 과목수를 알아내기
		int firstLine = Integer.parseInt(sc.nextLine());
		
		// 알아낸 과목 수 만큼 점수 저장하기
		float[] grade = new float[firstLine];
		
		
		String secondLine = sc.nextLine();
		
		for (int i = 0; i < grade.length; i++) {
			
			grade[i] = Float.parseFloat(secondLine.split(" ")[i]);
		}
		
		// 저장 된 점수 중에서 최고 점수 구하기 
		float max=0;
		for (int i = 0; i < grade.length; i++) {
			if(max<grade[i]) {
				max = grade[i];
			}
		}
		
        // 점수 조작 및 평균 구하기
		float sum = 0;
		
		for (int i = 0; i < grade.length; i++) {
			
			grade[i] = (grade[i]/max)*100;
			sum += grade[i];
		}
		
		float avg = sum/(float)firstLine;
		System.out.println(avg);
		
	}

}
