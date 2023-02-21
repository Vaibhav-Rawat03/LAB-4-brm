package mylab2;

import static org.junit.Assert.*;

import org.junit.Test;

public class q2labTest {

	@Test
	public void test() {
		q2lab ob=new q2lab();
		
		assertEquals(254,ob.reverse(432));
	}

}
