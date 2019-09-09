package fpplesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class prob1test {
	
	@Test
	
	public void testing() {
		String tester = prob1.sortstring("acce", "bdfc");
		String eop = "abccdef";
		assertEquals(eop,tester);
			
	}
}
