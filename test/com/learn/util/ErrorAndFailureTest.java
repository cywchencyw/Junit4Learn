package com.learn.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class ErrorAndFailureTest {

	/*
	 * 1��Failures һ���ɵ�Ԫ����ʹ�õĶ��Է����ж�ʧ��������ģ��⾭��ʾ���Ե㷢�������⣬����˵����
	 * 	����Ľ��������Ԥ�ڵĲ�һ����
	 * 2��Errors���ɴ����쳣����ģ������Բ����ڲ��Դ��뱾��Ĵ���Ҳ�����Ǳ����Դ����е�һ������bug����
	 * 3������������������֤�����ǶԵģ���������֤����û�д�
	 */
	@Test
	public void testAdd(){
		assertEquals(1, new Calculate().add(3, 7));
	}

	@Test
	public void testDivide(){
		assertEquals(0, new Calculate().divide(27, 0));
	}
}
