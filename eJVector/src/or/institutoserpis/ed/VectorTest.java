package or.institutoserpis.ed;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class VectorTest {

	@Test
	public void testIndexOf() {
		assertEquals(0, Vector.indexOf(new int[]{32,  15, 7, 9, 12}, 32));
		assertEquals(2, Vector.indexOf(new int[]{32,  15, 7, 9, 12}, 7));
		assertEquals(3, Vector.indexOf(new int[]{32,  15, 7, 9, 12}, 9));
		assertEquals(4, Vector.indexOf(new int[]{32,  15, 7, 9, 12}, 12));
		assertEquals(-1, Vector.indexOf(new int[]{32,  15, 7, 9, 12}, 99));
	}
	
	public void indexOfEmpty() {
		assertEquals(3, Vector.indexOf(new int[]{}, 123));
	
	}
public void min() {
	assertEquals(3, Vector.min(new int[]{32,  15, 7, 9, 12}));
}
}
