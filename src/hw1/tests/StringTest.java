package hw1.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringTest {

	@Test
	void compareToTest() {
		String str = "Hello";
		assertEquals(0, str.compareTo(str));
		assertEquals(-1, str.compareTo("Helloo"));
		assertEquals(1, str.compareTo("Hell"));
		
	}
	@Test
	void compareToIgnoreCaseTest() {
		String str = "Hello";
		assertEquals(0, str.compareToIgnoreCase(str));
		assertEquals(0, str.compareToIgnoreCase("heLLO"));
		assertEquals(-1, str.compareToIgnoreCase("hELloo"));
		assertEquals(-1, str.compareToIgnoreCase(str + 1));
		assertEquals(1, str.compareToIgnoreCase("hElL"));
		
	}
	@Test
	void concatTest() {
		String str1 = "Hello";
		String str2 = "Java";
		assertEquals("HelloJava", str1.concat(str2));
		assertEquals("HelloWorld", str1.concat("World"));
		assertEquals("JavaHello", str2.concat(str1));
	}
	@Test
	void startsWithTest() {
		String str = "Hello Java";
		assertTrue(str.startsWith("Hello"));
		assertTrue(str.startsWith("Java", 6));
		assertFalse(str.startsWith("Java"));
		assertFalse(str.startsWith("Java", 5));
	}
	@Test
	void endWithTest() {
		String str = "Hello Java";
		assertTrue(str.endsWith("Java"));
		assertFalse(str.endsWith("Hello"));
		
	}
	@Test
	void equalsIgnoreCaseTest() {
		String str = "HelLoJaVa";
		String str1 = "Hello";
		String str2 = "Java";
		assertTrue(str.equalsIgnoreCase("HELLOJava"));
		assertTrue(str.equalsIgnoreCase(str1 + str2));
		assertFalse(str.equalsIgnoreCase(str2 + str1));
	}
	@Test
	void indexOfTest() {
		String str = "Hello Java";
		assertEquals(4, str.indexOf('o'));
		assertEquals(6, str.indexOf('J'));
		assertEquals(8, str.indexOf('v'));
	}
	@Test
	void lastIndexOfTest() {
		String str = "Hello Java";
		assertEquals(4, str.lastIndexOf('o'));
		assertEquals(3, str.lastIndexOf('l'));
		assertEquals(9, str.lastIndexOf('a'));
	}
	}

