/**
 * 
 */
package org.dimigo.interfaces;

/**
 * <pre>
 * org.dimigo.interfaces.IDBManager
 *   |_IDBManager
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 25.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public interface IDBManager {
	
	public static final String ORACLE_DATABASE = "ORACLE";
	public static final String SYBASE_DATABASE = "SYBASE";
	
	public void insert();
	public void search();
	public void update();
	public void delete();
	
	public static IDBManager getDBObject(String database){
		
		if(database.equals(ORACLE_DATABASE))
			return new OracleDB();
		else
			return new SybaseDB();
	}
	
	
	
}
