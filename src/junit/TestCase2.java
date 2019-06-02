package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class TestCase2 {
	@BeforeClass
	public static void beforeClass() {
		System.out.println("�����ʱ����һ��");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("����غ�����һ��");
	}

	@Before
	public void before() {
		System.out.println("����ǰ��׼�������������������ݿ�ȵ�");
	}

	@After
	public void after() {
		System.out.println("���Խ�����Ĺ���������ر����ӵȵ�");
	}

	@Test
	public void testSum1() {
		int result = SumUtil.sum1(1, 2);
		Assert.assertEquals(result, 3);
	}

	@Test
	public void testSum2() {
		int result = SumUtil.sum2(1, 2, 3);
		Assert.assertEquals(result, 5);
	}

	/*
	 * @Before public void before(){ System.out.println("����ǰ��׼�������������������ݿ�ȵ�"); }
	 * 
	 * @After public void after(){ System.out.println("���Խ�����Ĺ���������ر����ӵ�"); }
	 * 
	 * @Test public void testSum1() { int result = SumUtil.sum1(1, 2);
	 * Assert.assertEquals(result, 3); }
	 * 
	 * @Test public void testSum2() { int result = SumUtil.sum2(1, 2, 3);
	 * Assert.assertEquals(result, 5); }
	 */
}
