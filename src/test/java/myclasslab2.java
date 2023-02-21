import static org.junit.Assert.*;

import org.junit.Test;

import mylab2.lab2;

public class myclasslab2 {

	@Test
	public void test() {
		lab2 obj = new lab2();
		assertEquals(13,obj.sum(3,10));
	}

}
