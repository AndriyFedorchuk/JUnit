package core;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AppTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("BeforeClass method will be executed before first test method starts");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("AfterClass method will be executed after last test method completed");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Before method will execute before every test method");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Test_01_assertEquals_Positive() {
		String s = "ok";
		assertEquals("Failure - string is not equal", "ok", s);
		System.out.println("Test_01_assertEquals_Positive");
	}

	@Test
	public void Test_02_assertEquals_Negative() {
		String jastAword = "O_ye";
		assertEquals("Failure - string is not equal", "O_No",jastAword);
		System.out.println("Test_02_assertEquals_Negative");
	}

	@Ignore
	@Test
	public void Test_03_assertEquals_Ignored() {
		String justAword = "O_Ye";
		assertEquals("Failure - string is not equal", "O_Ye", justAword);
		System.out.println("Test_03_assertEquals_Ignored");

	}

	@Test
	public void Test_04_AssertSame_Positive() {
		Integer smallNumber = 10;
		assertSame("Should be the same", 10, smallNumber);
		System.out.println("Test_04_AssertSame_Positive");

	}

	@Test
	public void Test_05_AssertSame_Negative() {
		Integer bigNumber = 5;
		assertSame("Should be the same", 6, bigNumber);
		System.out.println("Test_05_AssertSame_Negative");

	}

	@Ignore
	@Test
	public void Test_06_AssertSame_Ignored() {
		Integer smallNumber = 10;
		assertSame("Should be the same", 10, smallNumber);
		System.out.println("Test_06_AssertSame_Ignored");

	}

	@Test
	public void Test_07_assertFalse_Positive() {
		Boolean plohoy = false;
		assertFalse("Failure - Should be false", plohoy);
		System.out.println("Test_07_assertFalse_Positive");

	}

	@Test
	public void Test_08_assertFalse_Negative() {
		Boolean neplohoy = false;
		assertFalse("Failure - Should be false", neplohoy);
		System.out.println("Test_08_assertFalse_Negative");

	}

	@Test
	public void Test_09_assertTrue_Positive() {
		Boolean x = false;
		assertTrue("Failure - should be true", x);
		System.out.println("Test_09_assertTrue_Positive");

	}

	@Test
	public void Test_10_assertTrue_Negative() {
		Boolean Pravdivuy = false;
		assertTrue("True - should be true", Pravdivuy);
		System.out.println("Test_10_assertTrue_Negative");

	}

}
