package ru.spec.java1.lec4;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Utils {

	public static void main(String[] args) throws IOException {
		String s = FileUtils.readFileToString(new File("C:\\Users\\student\\file.txt"));
		System.out.println(s);

		Document doc = Jsoup.parse(new URL("http://www.specialist.ru/"), 5000);
		System.out.println(doc);
		Elements els = doc.select(".menu_main a");
		for(Element el : els){
			System.out.println(el.text());
			System.out.println(el.attr("href"));
		}
		if(doc instanceof Object){
			
		}
		// IOUtils.copy
		
	}

}
