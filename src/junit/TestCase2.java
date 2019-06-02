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
		System.out.println("类加载时运行一次");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("类加载后运行一次");
	}

	@Before
	public void before() {
		System.out.println("测试前的准备工作，比如链接数据库等等");
	}

	@After
	public void after() {
		System.out.println("测试结束后的工作，比如关闭链接等等");
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
	 * @Before public void before(){ System.out.println("测试前的准备工作，比如连接数据库等等"); }
	 * 
	 * @After public void after(){ System.out.println("测试结束后的工作，比如关闭连接等"); }
	 * 
	 * @Test public void testSum1() { int result = SumUtil.sum1(1, 2);
	 * Assert.assertEquals(result, 3); }
	 * 
	 * @Test public void testSum2() { int result = SumUtil.sum2(1, 2, 3);
	 * Assert.assertEquals(result, 5); }
	 */
}
