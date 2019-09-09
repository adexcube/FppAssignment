package fpplesson4;

import static org.junit.Assert.*;

import org.junit.Test;

public class prob2test {

	
	@Test
	
	public void testing () {
		char result = prob2.minimum("fccaeewwz", 'z');
		char eop = 'a';
		assertEquals(result,eop);
		
	}

}
