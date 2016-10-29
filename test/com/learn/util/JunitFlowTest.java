package com.learn.util;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFlowTest {

	/*
	 * 1��@BeforeClass���εķ����������еķ���������ǰִ�У�����
	 * �÷����Ǿ�̬�ģ����Ե������౻���غ���žͻ�ִ�������������ڴ���
	 * ��ֻ�����һ��ʵ�������Ƚ��ʺϼ��������ļ���
	 * 2��@AfterClass�����εķ���ͨ����������Դ��������ر����ݿ������
	 * 3��@Befter��@After����ÿ�����Է�����ǰ���ִ��һ�Ρ�
	 * 
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("this is beforeClass...");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("this is afterClass...");
		
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("this is before...");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("this is after...");
	}

	@Test
	public void test1() {
		System.out.println("this is test1");
	}

	@Test
	public void test2() {
		System.out.println("this is test2");
	}
}
