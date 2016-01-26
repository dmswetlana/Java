package ru.spec.java1.lec3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionTest {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();
		list1 = new LinkedList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(5);
		list1.add(8);
		list1.add(1,8);
		System.out.println("indexOf(8)="
				+ list1.indexOf(8));
		System.out.println("lastIndexOf(8)="
				+ list1.lastIndexOf(8));
		System.out.println(list1);
		
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		for (Integer i : list1) {
			System.out.println("->"+i);
		}
		
		list1.clear();
		list1.addAll(Arrays.asList(new Integer[]{9,8,7,6,5,4,3,3,2,1}));
		System.out.println(list1);
		
		Iterator<Integer> iterator = list1.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		Set<String> set = new HashSet<>(20,1f);
		set=new TreeSet<>();
		
		set.addAll(Arrays.asList(new String[]{
				"aaaaaaaaaaaa",
				"bbbbbbbbbbbb",
				"cccccccccccc",
				"cccccccccccc",
				"cccccccccccc",
				"cccccccccccc",
				"dddddddddddd",
				"Hello",
				"world",
				"123345567789",
				"qwertyuio"}));
		
		for (String s : set) {
			System.out.println(s.hashCode()%22+" - "+s);
		}

	}
	
	
	
	
	
	
	

}
