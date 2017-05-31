/**
 * 
 */
package org.dimigo.exception;

/**
 * <pre>
 * org.dimigo.exception
 *   |_Movie
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 5. 31.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class Movie {

	private String title;
	private int limitAge;
	
	public Movie(String title, int limitAge) {
		super();
		this.title = title;
		this.limitAge = limitAge;
	}

	public String getTitle() {
		return title;
	}

	public int getLimitAge() {
		return limitAge;
	}
	
	public void buyTicket(int age){
		try{
			if(age<limitAge){
				throw new Exception();
			}
			if(age>=limitAge){
		}
			System.out.println(title + "즐감하세요.");
		}catch(Exception e){
			System.out.println(title + "은/는 " + limitAge + "세 이상 관람가입니다.");
	}
	
	}

	
	
	
	
}
