/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 *   |_SmartPhone
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 15.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public abstract class SmartPhone {

	private String model;
	private String company;
	private int price;
	
	public SmartPhone(){}
	public SmartPhone(String model, String company, int price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public void tunrOn(){
		System.out.println(model+"의 전원을 켭니다.");
	}
	public void tunrOff(){
		System.out.println(model+"의 전원을 끕니다.");
	}
	public abstract void pay();
	
	
	public void useSpecialFunction(){
		if(this instanceof IPhone){
			((IPhone) this).useAirDrop();
		}
		else if(this instanceof Galaxy){
			((Galaxy) this).useWirelessCharging();
		}
	}
	
	@Override
	public String toString() {
		return "모델명 : "+model+", 제조사 : "+company+", 가격 : "+String.format("%,d", price)+"원";
	}
	
	
	
}
