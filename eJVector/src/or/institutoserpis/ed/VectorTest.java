package or.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class VectorTest {

	@Test
	public void testIndexOf() {
		assertEquals(3, Vector.indexOf(new int[]{32,  15, 7, 9, 12}, 9));
	}

}
