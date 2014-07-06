/** 
 * Project Name:springdao 
 * File Name:SequenceNumber.java 
 * Package Name:cn.bjfu.springdao.others 
 * Date:2014年7月5日 下午1:20:08 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package cn.bjfu.springdao.others;  


/** 
 * ClassName:SequenceNumber <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月5日 下午1:20:08 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class SequenceNumber {
	// 匿名内部类 为每一个线程提供一个副本
	private static ThreadLocal<Integer> seqNum = 
			new ThreadLocal<Integer>() {
			public Integer initialValue() {
				return 0;
			}
		};
	
	public int getNextNum() {
		seqNum.set(seqNum.get() + 1);
		return seqNum.get();
	}
	
	public static void main(String[] args) {
		SequenceNumber sn = new SequenceNumber();
		TestClient t1 = new TestClient(sn);
		TestClient t2 = new TestClient(sn);
		TestClient t3 = new TestClient(sn);
		
		t1.start();
		t2.start();
		t3.start();
	}
	
	private static class TestClient extends Thread {
		private SequenceNumber sn;
		public TestClient(SequenceNumber sn) {
			this.sn = sn;
		}
		
		public void run() {
			for (int i=0; i<3; i++) {
				System.out.println("thread[" + Thread.currentThread().getName() + 
						"] sn[" +sn.getNextNum() + "]" );
			}
		}
	}
	
}
 