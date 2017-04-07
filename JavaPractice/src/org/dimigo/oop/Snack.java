/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Snack
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 4. 6.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class Snack {
    private String name;
	private String company;
	private int price;
	private int count;
	/**
	 * @param string
	 * @param string2
	 * @param i
	 * @param j
	 */
	public Snack(String string, String string2, int i, int j) {
		this.name = string;
		this.company = string2;
		this.price = i;
		this.count = j;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the company
	 */
	public String getCompany() {
		return company;
	}
	/**
	 * @param company the company to set
	 */
	public void setCompany(String company) {
		this.company = company;
	}
	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}
	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}
	
	public String toString(){
		return "이름 : "+ name+"\n" + "제조사 : "+ company+"\n" + "가격 : "+ price+"원\n"+ "개수 : "+ count +"개";
	}
	
	public int calcPrice(){
		return price*count;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
