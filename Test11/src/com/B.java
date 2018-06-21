package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public  class B {
	int x=2;
	public  void p(){
		System.out.println("B:::"+x);
	} 
	public String a1(String a) throws FileNotFoundException  {
//		File f=new File("C:\\Users\\Administrator\\Desktop\\a.xml");
//		FileInputStream in =new FileInputStream(f);
//		byte[]b=new byte[10];
//		in.read(b);
//		System.out.println();
		return null;
	}
	public String a1(String b,String c)  throws Exception {
		
		return null;
		
	}
	public static void main(String[] args) throws Exception {
		//char[] c={73,76,79,86,69,85}; 
		String s="中国";
		System.out.println(new String(s));
		System.out.println(new String(s.getBytes("ISO-8859-1"),"gbk"));
		System.out.println(new String(s.getBytes("utf-8"),"ISO-8859-1"));
		System.out.println(new String(s.getBytes("ISO-8859-1"),"utf-8"));
		System.out.println(new String(s.getBytes("ISO-8859-1"),"utf-8").length());
		
	}
}
