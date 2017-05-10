/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Chinese
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 8.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class Chinese extends Person{
	public Chinese() {
		super();
	}
	public Chinese(String name) {
		super(name);
	}
	public void sayHello(){
		System.out.println("니하오");
	}
	public void sayBye(){
		System.out.println("쨔이찌엔");
	}
	
	@Override
	public String toString() {
		return "저는 중국사람 "+getName()+"입니다.";
	}
	
	

}
