package cn.uncode.schedule.test;

import java.awt.print.Printable;

import javax.ws.rs.GET;

public class MyStatic {
	public static String s = null;
	public static String getX(){
		System.out.println("getX");
		if (s==null) {
			s="nihao";
		}
		return s;
	}
	public static void printlll(){
		System.out.println(MyStatic.s);
	}
}
