package com;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestReflect {
	/**
	 * 抽象类不可以new所有用反射时，也不能调用抽象类的构造器
	 * @param reflectPath 需要反射的类名（全路径）
	 * @param methodName （要调用的method）
	 */
	public static void reflectTest(String reflectPath,String methodName){
		Class <?>[] paramTypes = null;
		try {
			//获取所有方法信息
			getMethodInfo(reflectPath);
			
			//创建一个类实例(带参数构造器)
			Class[] type = new Class[2];
			type[0] = Integer.TYPE;
			type[1] = String.class;
			Object[] obj = new Object[2];
			obj[0] = 1;
			obj[1] = "ssssss";
			Class<?> c=Class.forName(reflectPath);
			
			Constructor<?> con = c.getConstructor(type);
			Object con1 = con.newInstance(obj);
			//调用method
			Class[] ty = new Class[1];
			ty[0] = Integer[].class;
			
			Object[] o = new Object[0];
			Integer[] in = new Integer[10];
			for(int i=0;i<in.length;i++){
				in[i] = i;
			}
			Method mi = c.getMethod(methodName, ty);
			Object value = mi.invoke(con1, new Object[]{in});
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 /**
	    * 传入全类名获得对应类中所有方法名和参数名
	    */
	   @SuppressWarnings("rawtypes")
	   private static void getMethodInfo(String pkgName) {
	       try {
	           Class clazz = Class.forName(pkgName);
	           Method[] methods = clazz.getMethods();
	           for (Method method : methods) {
	               String methodName = method.getName();
	               System.out.println("方法名称:" + methodName);
	               Class<?>[] parameterTypes = method.getParameterTypes();
	               for (Class<?> clas : parameterTypes) {
	                   String parameterName = clas.getName();
	                   System.out.println("参数名称:" + parameterName);
	               }
	               System.out.println("*****************************");
	           }
	       } catch (ClassNotFoundException e) {
	           e.printStackTrace();
	       }
	   }
	public static void main(String[] args) {
		reflectTest("com.Test","arraysTest");
		
	}

}
