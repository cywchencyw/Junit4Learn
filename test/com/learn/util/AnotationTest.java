package com.learn.util;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;

public class AnotationTest {

	/*
	 * @Test��һ����ͨ�������γ�Ϊһ�����Է���
	 * 		@Test(expected=XXX.class)
	 * 		@Test(timeout=����)
	 * @BeforeClass�����������еķ�������ǰ��ִ�У�static����
	 * @AfterClass:���������еķ������н�����ִ�У�static����
	 * @Before:����ÿһ�����Է�����ִ��ǰִ��һ��
	 * @After:����ÿһ�����Է���������ִ��һ��
	 * @Ignore:�����εĲ��Է����ᱻ��������������
	 * @RunWith:���Ը��Ĳ�����������Ҫ�̳�org.junit.runner.Runner����
	 * 
	 */
	
	@Test(expected=ArithmeticException.class)
	public void testDivide(){
		assertEquals(3, new Calculate().divide(27, 0));
	}
	
	@Ignore("��Ҫִ��")
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
