package com.learn.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	/*
	 * 1�����Է����ϱ���ʹ��@Test��������
	 * 2�����Է�������ʹ��Public void�������Σ����ܴ��κεĲ���
	 * 3���½�һ��ԴĿ¼��������ǵĲ��Դ���
	 * 4��������İ�Ӧ�úͱ������ౣ��һ��
	 * 5�����Ե�Ԫ�е�ÿ������������Զ������ԣ����Է����䲻�����κε�����
	 * 6��������ʹ��Test��Ϊ�����ĺ�׺�����Ǳ��룩
	 * 7�����Է���ʹ��test��Ϊ��������ǰ׺�����Ǳ��룩
	 */

	
	@Test
	public void testAdd(){
		assertEquals(10, new Calculate().add(3, 7));
	}

	@Test
	public void testSubtract(){
		assertEquals(-2, new Calculate().subtract(2, 4));
	}
	
	@Test 
	public void testMultiply(){
		assertEquals(6, new Calculate().multiply(2, 3));
	}
	
	@Test
	public void testDivide(){
		assertEquals(3, new Calculate().divide(27, 9));
	}
}
