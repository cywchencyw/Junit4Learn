package com.learn.util;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * 
 * @author chenyawei 2016年10月29日
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({TaskTest1.class,TaskTest2.class,TaskTest3.class})
public class SuiteTest {

	/*
	 * 1、测试套件就是组织测试类一起运行的
	 * 
	 * 如何写一个测试套件呢？
	 * 
	 * 写一个作为测试套件的入口类（如SuiteTest类），这个类里不包含其他的方法
	 * 更改测试运行器Suite.class
	 * 将要测试的类作为数组传入到Suite.SuiteClasses({})
	 */

}
