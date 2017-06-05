/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonChart
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 6. 5.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class MelonChart {

	public static void main(String[] args) {
		
		List<Music> list = new ArrayList<>();
		list.add(new Music("I LUV IT" , "PSY"));
		list.add(new Music("맞지?", "언니쓰"));
		System.out.println("-- << 멜론 챠트 >> --");
		PrintList(list);
		System.out.println("-- << 2위 곡 추가 >> --");
		list.add(1, new Music("SIGNAL", "트와이스"));
		PrintList(list);
		System.out.println("-- << 3위 곡 변경 >> --");
		list.set(2, new Music("팔레트", "아이유"));
		PrintList(list);
		System.out.println("-- << 2위 곡 삭제 >> --");
		list.remove(1);
		PrintList(list);
		System.out.println("-- << 전체 리스트 삭제 >> --");
		list.clear();
		
		
	}
	
	public static void PrintList(List<Music> list){
		int i = 1;
		for(Music m : list){
			System.out.print(i);
			System.out.println(m);
			i++;
		}System.out.println();
	}

	
	}

