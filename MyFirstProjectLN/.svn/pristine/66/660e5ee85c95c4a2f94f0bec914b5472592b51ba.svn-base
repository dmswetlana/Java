package ru.spec.java1.lec3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapTest {

	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		map.put("hello", "world");
		map.put("123", "456");
		map.put("hello", "world123");
		map.put("qwe", "asd");
		map.put("zxc", "cvb");
		
		System.out.println(map.get("hello"));

		for(String s : map.keySet()){
			System.out.println(s+":"
					+ map.get(s));
		}
		for(String s : map.values()){
			System.out.println(s);
		}
		for(Entry<String, String> e : map.entrySet()){
			System.out.println(e.getKey()+"-:-"+e.getValue());
		}
		map.forEach((k,v)->System.out.println(k+"="+v));

	}

}
