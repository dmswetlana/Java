
import java.util.HashMap;
import java.util.Map;

public class HashDemo {

	static String en = "`1234567890-=\\" + "qwertyuiop[]" + "asdfghjkl;'" + "zxcvbnm,./" + "~!@#$%^&*()_+|"
			+ "QWERTYUIOP{}" + "ASDFGHJKL:\"" + "ZXCVBNM<>?";

	static String ru = "ё1234567890-=\\" + "йцукенгшщзхъ" + "фывапролджэ" + "ячсмитьбю." + "!\"№;%:?*()_+"
			+ "ЙЦУКЕНГШЩЗХЪ" + "ФЫВАПРОЛДЖЭ" + "ЯЧСМИТЬБЮ,";

	static Map<Character, Character> layoutEnToRu = new HashMap<>();
	static Map<Character, Character> layoutRuToEn = new HashMap<>();

	public static void main(String[] args) {

		initMaps();
		System.out.println(getRu("Ghbdtn vbh!"));

	}

	static public String getRu(String en) {
		String ru = "";

		for (int i = 0; i < en.length(); i++) {
			char enChar = en.charAt(i);
			Character ruChar = layoutEnToRu.get(enChar);

			ru += (ruChar == null ? enChar : ruChar);

		}

		return ru;
	}

	private static void initMaps() {
		for (int i = 0; i < ru.length(); i++) {
			layoutRuToEn.put(ru.charAt(i), en.charAt(i));
			layoutEnToRu.put(en.charAt(i), ru.charAt(i));
		}
	}
	
	
}
