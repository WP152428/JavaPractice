/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces.IDBManager
 *   |_OracleDB
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 25.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class OracleDB implements IDBManager{

	public void insert(){System.out.println("Sybase DB 저장");}
	public void search(){System.out.println("Sybase DB 조회");}
	public void update(){System.out.println("Sybase DB 변경");}
	public void delete(){System.out.println("Sybase DB 삭제");}
	
}
