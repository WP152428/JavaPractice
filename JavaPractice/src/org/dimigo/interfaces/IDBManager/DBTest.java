/**
 * 
 */
package org.dimigo.interfaces.IDBManager;

/**
 * <pre>
 * org.dimigo.interfaces.IDBManager
 *   |_DBTest
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 25.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class DBTest {
	public static void main(String[] args) {
		System.out.println("< 변경 전 >");
		crud(IDBManager.getDBObject("SYBASE"));
		System.out.println();
		System.out.println("< 변경 후 >");
		crud(IDBManager.getDBObject("ORACLE"));

	}
	private static void crud(IDBManager db){
		db.insert();
		db.search();
		db.update();
		db.delete();
	}
}
