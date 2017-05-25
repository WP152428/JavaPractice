/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces.IDBManager
 *   |_SybaseDB
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 25.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class SybaseDB implements IDBManager{

	public void insert(){System.out.println("Oracle DB 저장");}
	public void search(){System.out.println("Oracle DB 저장");}
	public void update(){System.out.println("Oracle DB 저장");}
	public void delete(){System.out.println("Oracle DB 저장");}
}
