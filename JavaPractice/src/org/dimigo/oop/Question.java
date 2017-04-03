/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Question
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 3. 31.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class Question {
	public static void main(String[] args) {
		String[] Q ={"1.가장 좋아하는 가수는?","2.가장 좋아하는 배우는?","3.가장 좋아하는 과목은?"};
		String[] A ={"빅뱅","조인성","응용 프로그래밍"};
		String system;
		Scanner scanner = new Scanner(System.in);
		for(int i=0;i<=2;i++){
			System.out.println(Q[i]);
			String answer = scanner.nextLine();
			System.out.println(answer.equals(A[i]) ? "정답입니다!":"틀렸습니다!");
		}scanner.close();
		
    	StringBuilder sb = new StringBuilder();
	    for(int i = 0;i<=2;i++){
	    	sb
	    		.append(Q[i])
	    		.append(" ")
	    		.append(A[i])
	    		.append("입니다.\n");
	    }

	    System.out.println("<< 결과 출력 >>");
    	System.out.println(sb.toString());
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						

	}

}
