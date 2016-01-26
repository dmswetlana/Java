package ru.spec.java1.lec4;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Strings {

	public static void main(String[] args) throws InterruptedException {
//		stringsTests();

		System.out.println(Menu.SUB_PROJECT_1_1);
		System.out.println(Menu.ABOUT==Menu.ABOUT);
		
		int i = 50_000_000;
		Menu item = Menu.MAIN;
		item.action();
		TimeUnit.SECONDS.sleep(5);
		Thread.sleep(5*1000*60*60*24);
		
		switch (item) {
		
		case ABOUT:
			System.out.println("About");
			
			break;
		case HELP:
		case MAIN:
		case PROJECTS:
		default:
		
		}
		
	}

	private static void stringsTests() {
		Pattern p = Pattern.compile("(\\d{2}\\.){2}(?<year>\\d{4})");
		Matcher m = p.matcher("jsdbf skjdfh sdbfewjkrb dsfhvzxjhf dsg 22.01.1997hdfb sdfjhsdgb f");
		for(;m.find();){
			//System.out.println(m.group(0));
			//System.out.println(m.group(1));
			System.out.println(m.group("year"));
		}

		String s = "f";
		String s1 = s;
		
		long ts = System.currentTimeMillis();
		//s = addString(s, s1);
		s = addStringSB(s, s1);
		System.out.println(System.currentTimeMillis()-ts+"ms");
		System.out.println(s.length());
	}

	private static String addStringSB(String s, String s1) {
		StringBuilder sb = new StringBuilder();
		sb.append(s);
		for(int i=0 ; i<100000 ;i++){
			sb.append(s1);
		}
		s=sb.toString();
		return s;
	}

	private static String addString(String s, String s1) {
		for(int i=0 ;i<100000;i++){
			s+=s1;
		}
		return s;
	}

	private static void win() {
		JFrame frame = new JFrame("My win");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		frame.setLayout(new FlowLayout());
		
		JButton b = new JButton("ok");
		frame.add(b);
		
		b.addMouseListener(new MyClickAction());
	}

}
class MyClickAction implements MouseListener{

	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("ok1");
		
	}
	
}
