package server;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class GreeterTestJUnit4 {

	@Test
	public void testGreet() {
		assertEquals("Hello hot reaload!!", Greeter.greet());
	}	
}
