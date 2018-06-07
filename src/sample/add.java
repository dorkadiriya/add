package sample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class add {

	@Test
	void test() {
		gb test=new gb();
		int output=test.add(1, 3);
		assertEquals(4,output);
		
	}

}
