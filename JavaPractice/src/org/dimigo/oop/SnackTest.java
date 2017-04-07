/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_SnackTest
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 4. 6.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	        Snack[] snackArr = new Snack[3];
	        int sum=0;
	        snackArr[0] = new Snack("새우깡","농심",1100,2);
	        snackArr[1] = new Snack("콘칲","크라운",1200,1);
	        snackArr[2] = new Snack("허니버터칩","해태",1500,4);
	        
	        for(int i = 0;i<3;i++){
	        	System.out.println(snackArr[i].toString());
	        	System.out.println();
	        }
	        for(int i = 0;i<3;i++){
	        	sum += snackArr[i].calcPrice();
	        }
	     
	       
	        System.out.println("총 구매 금액 : " + String.format("%,d",sum) + "원");
	        
	        
	        

	}

}
