package iloveyouboss;

//import static org.junit.Assert.assertTrue;
import static org.junit.Assert.*;

import org.junit.Ignore;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class AssertTest {
	//assertTrue
	@Test
	public void assertTrueTest() {
		boolean b1 = true;
		assertTrue(b1);
	}
	
	//assertFalse
	// »ý·«.
	
	
	//assertThat
	@SuppressWarnings("deprecation")
	@Ignore
	@Test
	public void assertThatTest() {
		assertThat(1,equalTo(2));
	}
	
	@Test
	public void startwithTest() {
		assertThat("asdf", not(startsWith("aswd")));
	}
	
}
