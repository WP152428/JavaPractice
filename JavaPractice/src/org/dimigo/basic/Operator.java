/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *   |_Operator
 * 
 * 1. 개요 : dimibene
 * 2. 작성 : 2017. 3. 14.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class Operator {
	public static void main(String[] args) {
		
		int wol = 1700000;
		int employ = 3;
		int store = 1500;
		
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.println("월 평균 급여 : " +String.format("%,d",wol)+"원");
		System.out.println("점포 내 직원 수 : "+employ+"명");
		System.out.println("점포 수 : "+String.format("%,d",store)+"개");
		System.out.println("연간 인건비 : "+String.format("%,d",(long)wol*(long)employ*(long)store*12)+"원");

		
		
	}

}
