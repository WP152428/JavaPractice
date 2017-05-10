/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_Korean
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 8.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class Korean extends Person {
	public Korean() {
		super();
	}
	
	public Korean(String name) {
		super(name);
		}
	public void sayHello(){
		System.out.println("안녕하세요");
	}
	public void sayBye(){
		System.out.println("안녕히 계세요");
	}
	@Override
	public String toString() {
		return "저는 한국사람 "+getName()+"입니다.";
	}
	
	
	
	
}
