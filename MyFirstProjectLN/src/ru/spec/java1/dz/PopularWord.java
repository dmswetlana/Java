package ru.spec.java1.dz;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.TreeMap;

import org.apache.commons.io.FileUtils;

public class PopularWord {

	public static void main(String[] args) throws IOException {
		String file = FileUtils.readFileToString(new File("c:\\text.txt.txt"), "UTF-8");
		String[] words = file.replaceAll("[^a-zA-Z]", " ").replaceAll("\\s{2,}", " ").split(" ");

		Map<String, Integer> map = new HashMap<>();

		/*for (String w : words) {
			Integer count = map.get(w);
			count = count == null ? 1 : count + 1;
			map.put(w, count);
		}*/
		
		for (int i = 0; i < words.length-4; i++) {
			String w = "";
			for(int j =0 ; j<4 ; j++){
				w+=words[i+j]+" ";
			}
			Integer count = map.get(w);
			count = count == null ? 1 : count + 1;
			map.put(w, count);
		}

		BiConsumer bc = new BiConsumer<Integer, String>() {
			@Override
			public void accept(Integer k, String v) {
				System.out.println(k + " " + v);

			}
		};

		TreeMap<Integer, String> sort = new TreeMap<>();
		for (Entry<String, Integer> e : map.entrySet()) {
			sort.put(e.getValue(), e.getKey());
			//bc.accept(e.getKey(), e.getValue());

		}

		sort.forEach(bc);
		System.out.println(sort.lastKey()+" "+sort.lastEntry().getValue());
		//sort.forEach((key, val) -> System.out.println(key + " " + val));

	}

}
