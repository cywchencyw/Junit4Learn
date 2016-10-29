package com.learn.util;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

	/*
	 * @Test将一个普通方法修饰成为一个测试方法
	 * 		@Test(expected=XXX.class)
	 * 		@Test(timeout=毫秒)
	 * @BeforeClass：它会在所有的方法运行前被执行，static修饰
	 * @AfterClass:它会在所有的方法运行结束后被执行，static修饰
	 * @Before:会在每一个测试方法被执行前执行一次
	 * @After:会在每一个测试方法结束后被执行一次
	 * @Ignore:所修饰的测试方法会被测试运行器忽略
	 * @RunWith:可以更改测试运行器，要继承org.junit.runner.Runner此类
	 * 
	 */
	
	@Test(expected=ArithmeticException.class)
	public void testDivide(){
		assertEquals(3, new Calculate().divide(27, 0));
	}
	
	@Ignore("不要执行")
	@Test(timeout=1000)
	public void testWhile(){
		while(true){
			System.out.println("run forever....");
		}
	}
	
	@Test(timeout=3000)
	public void testReadFile(){
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
