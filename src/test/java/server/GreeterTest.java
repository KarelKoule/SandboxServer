package server;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class GreeterTest {

	@Test
	public void testGreet() {
		assertEquals("Hello hot reaload!!", Greeter.greet());
	}
	
	
	
}
