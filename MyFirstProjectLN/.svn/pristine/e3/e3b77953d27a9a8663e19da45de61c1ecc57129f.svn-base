package ru.spec.java1.lec3;

import java.util.HashMap;
import java.util.Map;

public class Punto {

	static String ru = "ρ1234567890-=\\©ζγª¥­£θι§εκδλΆ ―ΰ®«¤¦νοηα¬¨βμ΅ξ."
			+ "π!\"ό;%:?*()_+/‰–“…ƒ™‡•”›‚€‹„†—‘’,";
	static String en = "`1234567890-=\\qwertyuiop[]asdfghjkl;'zxcvbnm,./"
			+ "~!@#$%^&*()_+|QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";

	static Map<Character, Character> ruToEn = new HashMap<>();
	static Map<Character, Character> enToRu = new HashMap<>();

	static {
		for (int i = 0; i < ru.length(); i++) {
			ruToEn.put(ru.charAt(i), en.charAt(i));
			enToRu.put(en.charAt(i), ru.charAt(i));
		}
	}

	static public String correct(String src) {
		String res = "";

		for (int i = 0; i < src.length(); i++) {
			Character c = enToRu.get(src.charAt(i));
			
			// A?B:C
			res += c == null ? src.charAt(i) : c;
			/*if(c==null){
				res+=src.charAt(i);
			}else{
				res+=c;
			}*/
			
			
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(correct("Hello world"));

	}

}
