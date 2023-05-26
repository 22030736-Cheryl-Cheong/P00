import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		
		int a =1234;
		int b =8765;
		
		Calculate cal = new Calculate();
		
		int actual = cal.add(a, b);
		
		int expected =9999;
		
		assertEquals(expected,actual);
		
	}
	@Test
	public void testSubstract() {
		
		int a =800;
		int b = 200;
		
		Calculate cal= new Calculate();
		
		int actual = cal.subtract(a, b);
		
		int expected = 600;
		
		assertEquals(expected,actual);
	}
	@Test
	public void testMultiply() {
		
		int a = 7;
		int b = 5;
		
		Calculate cal = new Calculate();
		
		int actual = cal.mutiply(a, b);
		
		int expected = 35;
		
		assertEquals(expected,actual);
	}
	@Test
	public void testDivide() {
		
		int a = 21;
		int b = 3;
		
		Calculate cal = new Calculate();
		
		int actual = cal.divide(a, b);
		
		int expected = 7;
		
		assertEquals(expected,actual);
		
		int c = 0 ;
		int d = 0;
		
		
		int zerocheck = cal.divide(c,d);
		
		int zeroexpect = 0;
		
		assertEquals(zerocheck,zeroexpect);
	
		
	}

}
