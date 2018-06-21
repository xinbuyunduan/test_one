package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Sub extends B implements A {
	public  void p(){
		System.out.println(super.x);
	} 
	 public static void main(String sgf[]) throws Exception{
		// new Sub().p();
		 Class c=Class.forName("com.Sub");
		 Method mm[]=c.getDeclaredMethods();
		 Constructor[] con = c.getDeclaredConstructors();
		 for(Method m:mm){
			 System.out.println(m.getName());
			Class[]cc = m.getParameterTypes();
			for(Class c1:cc){
				System.out.println(c1.getName()+","+c1.getTypeParameters());
			}
		 }
	 }
	 public String a1(String a)   {
//			File f=new File("C:\\Users\\Administrator\\Desktop\\a.xml");
//			FileInputStream in =new FileInputStream(f);
//			byte[]b=new byte[10];
//			in.read(b);
//			System.out.println();
			return null;
		}
}