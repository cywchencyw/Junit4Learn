package com.learn.util;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class ParameterTest {
	
	/*
	 *1������Ĭ�ϵĲ���������ΪRunWith(Parameterized.calss)
	 *2���������������Ԥ��ֵ�ͽ��ֵ
	 *3������һ������ֵΪCollection�Ĺ�����̬��������ʹ��@Parameters��������
	 *4��Ϊ����������һ�����в����Ĺ������캯������������Ϊ֮����������ֵ
	 *
	 */
	
	int expected = 0;
	int input1 = 0;
	int input2 = 0;
	
	@Parameters
	public static Collection<Object[]> t(){
		return Arrays.asList(new Object[][]{
			{3,2,1},
			{10,2,8}
		});
	}
	
	public ParameterTest(int expected,int input1,int input2){
		this.expected = expected;
		this.input1 = input1;
		this.input2 = input2;
	}

	@Test
	public void testAdd(){
		assertEquals(expected,new Calculate().add(input1, input2));
	}
}
