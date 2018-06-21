package com.thread;

public class ThreadTest{
	class myThread1 extends Thread{
		private int x=0;
		public void run(){
			while(x!=6){
				System.out.println("myThread111");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 
	}
	class myThread2 implements Runnable{
		private int x=0;
		public void run(){
			while(x!=6){
				System.out.println("myThread222");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public static void main(String[] args)  {
		ThreadTest tt=new ThreadTest();
		myThread1 t1=tt.new myThread1();
		myThread2 t2=tt.new myThread2();
		t1.start();
		new Thread(t2).start();
		
	}

}
