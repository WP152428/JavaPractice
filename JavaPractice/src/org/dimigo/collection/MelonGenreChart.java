/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 *   |_MelonGenreChart
 * 
 * 1. 개요 : 
 * 2. 작성 : 2017. 6. 12.
 * <pre>
 *
 * @author : ggoyang
 * @version : 1.0
 *
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();
		List<Music> ballad = new ArrayList<>();
		List<Music> dance = new ArrayList<>();
		ballad.add(new Music("팔레트", "아이유"));
		dance.add(new Music("I LUV IT" , "PSY"));
		dance.add(new Music("맞지?", "언니쓰"));
		map.put("발라드",ballad);
		map.put("댄스",dance);
		System.out.println("-- << 멜론 장르별 챠트 >> --");
		printMap(map);
		System.out.println();
		System.out.println("-- << 댄스 2위 곡 변경 >> --");
		dance.set(1, new Music("SIGNAL", "트와이스"));
		printMap(map);	
		System.out.println();
		System.out.println("-- << 댄스 1위 곡 삭제 >> --");
		dance.remove(0);
		printMap(map);
		System.out.println();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		dance.clear();
		ballad.clear();
		
		

	}
	
	
	
	public static void printMap(Map<String, List<Music>> map){
		for(String key : map.keySet()){
			System.out.println("["+key+"]");
			int i = 1;
			for(Music m : map.get(key)){
				System.out.print(i);
				System.out.println(m);
				i++;
			}
		}
		
	}

}
