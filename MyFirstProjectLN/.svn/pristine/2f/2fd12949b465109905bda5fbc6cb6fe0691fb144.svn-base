package ru.spec.java1.lec5;

import java.util.Collections;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

class MyThread implements Runnable {

	@Override
	public void run() {
		System.out.println("hello " + Thread.currentThread());
		new Thread() {
			public void run() {
				System.out.println("world " + Thread.currentThread());
			};
		}.start();

	}

}

public class ThreadTest {


	static <T,K extends Runnable,R> T proxy(T arg, K k){
		return arg;
	}
	static Object proxy1(Object arg){
		return arg;
	}
	
	public static void f(int i) {
		System.out.println("123");
		System.out.println("qwe");
		System.out.println("asd " + i);
	}

	public static void main(String[] args) throws InterruptedException, ExecutionException {
//		 newthread();
		ExecutorService es = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors()*4);
		
		for (int i = 0; i < 10; i++) {
			int arg = i;
			new Thread(() -> f(arg)).start();
		}
		Callable<String> call = new Callable<String>(){
			@Override
			public String call() throws Exception {
				return "hello";
			}
		};
		Future<String> f = es.submit(call);
		System.out.println(Thread.currentThread()+" : "+f.get());
		
		
		
//		System.out.println(((Long)proxy1(1L)).longValue());
//		System.out.println(proxy(1L).longValue());
		
	}

	private static void newthread() throws InterruptedException {
		System.out.println("start " + Thread.currentThread());

		int i = 5;
		for (; i < 100; i++) {
			int arg = i;

			Thread t = new Thread() {

				@Override
				public void run() {

					try {
						TimeUnit.SECONDS.sleep(4);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("hello " + arg + " " + Thread.currentThread());
				}
			};

			// i++;
			// System.out.println("run");

			/// t.setDaemon(true);
			t.setPriority(i % 10 + 1);
			t.start();
		}
		TimeUnit.SECONDS.sleep(2);

		System.out.println("end");
	}

}
