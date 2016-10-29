package com.learn.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateTest {

	/*
	 * 1、测试方法上必须使用@Test进行修饰
	 * 2、测试方法必须使用Public void进行修饰，不能带任何的参数
	 * 3、新建一个源目录来存放我们的测试代码
	 * 4、测试类的包应该和被测试类保持一致
	 * 5、测试单元中的每个方法必须可以独立测试，测试方法间不能有任何的依赖
	 * 6、测试类使用Test作为类名的后缀（不是必须）
	 * 7、测试方法使用test作为方法名的前缀（不是必须）
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
