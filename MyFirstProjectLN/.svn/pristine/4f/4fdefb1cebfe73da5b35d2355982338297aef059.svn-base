package ru.spec.java1.lec5;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import org.apache.commons.io.FileUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class CommentRang {

	public static void main(String... args) throws IOException {

		ExecutorService es = Executors.newWorkStealingPool(Runtime.getRuntime().availableProcessors() * 2);

		final int MAX = 10;
		Future<List<String>> results[] = new Future[MAX];
		for (int i = 0; i < MAX; i++) {
			int cnum = i;
			// Callable<List<String>> c = new Callable<List<String>>() {
			//
			// @Override
			// public List<String> call() throws Exception {
			// Document doc = Jsoup.parse(new URL("http://habrahabr.ru/post/" +
			// (cnum + 100000) + "/"), 15000);
			// Elements els = doc.select("#comments span.score");
			// List<String> scores = new ArrayList<>();
			// for (Element el : els) {
			// scores.add(el.text());
			// }
			// return scores;
			// }
			// };
			results[i] = es.submit(() -> {
				Elements els=null;
				try {
					Document doc = Jsoup.parse(new URL("http://habrahabr.ru/post/" + (cnum + 100000) + "/"), 15000);
					els = doc.select("#comments span.score");
				} catch (Exception ex) {
					return new ArrayList<>();
				}
				List<String> scores = new ArrayList<>();
				for (Element el : els) {
					scores.add(el.text().replaceAll("[^+\\d]", "-"));
				}
				return scores;
			});
		}

		TreeSet<String> set = new TreeSet<>();
		for (Future<List<String>> f : results) {
			try {
				set.addAll(f.get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		set.forEach((s) -> System.out.println(s));
	}

}
