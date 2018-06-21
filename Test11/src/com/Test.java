package com;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

import javax.xml.namespace.QName;


public  class Test {
	private Test(){
		System.out.println("private调用构造函数+++++++++++++++");
	}
	public Test(int n,String s){
		System.out.println("public调用构造函数+++++++++++++++");
	}
	public static void arraysTest(Integer[] nn) {
		
		for (Integer i : nn) {
			System.out.println(i);
		}
	}

	public static void stringTest() {
		String ss = "asc";

	}

	public static void maopaoTest() {
		int temp;
		int[] arr = { 26, -5, 9, 4, 79, 2, 36, 1, 12, 10001, -6, 11, 45, -101, 1000 };
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (int a : arr) {
			System.out.print(a + ",");
		}

	}

	public static void FileTest(String path) throws IOException {
		File f = new File(path);
		String toPath = "C:" + File.separator + "Users" + File.separator + "Administrator" + File.separator + "Desktop"
				+ File.separator + "D1111" + File.separator + "test.txt";
		File tof = new File(toPath);
		System.out.println(tof.getParentFile());
		System.out.println(tof);
		if (!tof.exists()) {
			if (!tof.getParentFile().exists()) {
				tof.getParentFile().mkdir();
			}
			tof.createNewFile();
		}
		InputStream in = new FileInputStream(f);
		// InputStreamReader reader=new InputStreamReader(in,"gbk");
		byte[] b = new byte[100];
		// BufferedReader br=new BufferedReader(reader);

		OutputStream out = new FileOutputStream(tof, true);// true追加写入，
															// false清空文件写入
		OutputStreamWriter writer = new OutputStreamWriter(out, "gbk");
		// BufferedWriter bw=new BufferedWriter(writer);

		int line;
		while ((line = in.read(b)) != -1) {
			System.out.println(new String(b));
			// bw.write(line);
			// bw.write("\r\n");
		}
		// while((line = br.readLine())!=null){
		// System.out.println(new String(line));
		// bw.write(line);
		// bw.write("\r\n");
		// }
		// bw.flush();
		// br.close();
		in.close();
		// reader.close();

		out.close();
		writer.close();

	}

	public static void main(String[] args) {   
//		String xmlInput = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
//					+ "<request><operateType>query"
//					+ "</operateType><dbType>sqlserver</dbType><orderBy></orderBy><userId>1</userId>"
//					+ "<start>0</start><limit>20</limit><processName></processName></request>";    
//			JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
			String wsUrl = "http://127.0.0.1:8080/SSHDemo/user/UserQuery?wsdl";
			String method = "selectUserByParam";
			String targetNamespace = "http://webService.demo.com";
			
//			String wsUrl = "http://127.0.0.1:9998/myweb?wsdl";
//			String method = "alarmManage";
//			String targetNamespace = "http://ws.accredit.ultrapower.com/";
		 //url为调用webService的wsdl地址  
	        QName name=new QName(targetNamespace,method);  
//			Client client = dcf.createClient(wsUrl);
			Object[] res = null;
//			try {
//				res = client.invoke(name, "hello");
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
			System.exit(0);
		}
	public int addOne(int x) {
	return ++x;
}
	
}
