/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 *   |_Car
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 3. 23.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class Car3 {

	private String company ;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
     
	public Car3(){
		
	}
	
	public Car3(String company, String model, String color, int maxSpeed, int price){
		
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
		
	}
	public Car3(String company, String model, String color, int maxSpeed){
		
		this(company,model,color,maxSpeed,0);
		
	}
	public Car3(String company, String model, String color){
		
		this(company,model,color,0);
	
		
	}
	
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	 }
	
	
	
	
	
}