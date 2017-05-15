/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 15.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class SmartPhoneTest {
	public static void main(String[] args) {
		SmartPhone[] s = {
				new IPhone("iPhone 7","애플",900000),
				new Galaxy("갤럭시 S8","삼성",800000),
				
		};

		for(int i=0;i<2;i++){
			System.out.println(s[i]);
			s[i].tunrOn();
			s[i].pay();
			s[i].useSpecialFunction(s[i]);
			s[i].tunrOff();
			System.out.println();
			
			
			
			
			
			
		}
		
	}

}
