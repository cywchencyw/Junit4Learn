package com.learn.util;



import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitFlowTest {

	/*
	 * 1、@BeforeClass修饰的方法会在所有的方法被调用前执行，而且
	 * 该方法是静态的，所以当测试类被加载后接着就会执行它，而且在内存中
	 * 它只会存在一份实例，它比较适合加载配置文件。
	 * 2、@AfterClass所修饰的方法通常用来对资源的清理，如关闭数据库的链接
	 * 3、@Befter和@After会在每个测试方法的前面各执行一次。
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
