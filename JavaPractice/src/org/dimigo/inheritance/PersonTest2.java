/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_PersonTest
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 8.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class PersonTest2 {
	public static void main(String[] args) {
		Person[] people = { 
		new Person("Tom"),
		new Korean("홍길동"),
		new Japanese("다나카"),
		new Chinese("왕밍")
		};
		for(Person person : people){
			
			greeting(person);
		}
        
		

	}
	
	private static void greeting(Person people){
		System.out.println(people);
		people.sayHello();
		people.sayBye();
		System.out.println();
	}

}
