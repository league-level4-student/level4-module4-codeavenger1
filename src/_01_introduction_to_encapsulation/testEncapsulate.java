package _01_introduction_to_encapsulation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class testEncapsulate {

	EncapsulateTheData tester = new EncapsulateTheData();
	
	@Test
	public void testItemsRecieved() {
		
		assertEquals(0, tester.getItemsReceived());
		
		tester.setItemsReceived(-2);
		assertEquals(0, tester.getItemsReceived());
		
		tester.setItemsReceived(10);
		assertEquals(10, tester.getItemsReceived());
	}
	
	@Test
	public void testDegreesTurned() {
		assertEquals(0.0, tester.getDegreesTurned());
		
		tester.setDegreesTurned(-60.0);
		assertEquals(0.0, tester.getDegreesTurned());
		
		tester.setDegreesTurned(360.1);
		assertEquals(360.0, tester.getDegreesTurned());
		
		tester.setDegreesTurned(340.0);
		assertEquals(340.0, tester.getDegreesTurned());
	}
	
	@Test
	public void testNomenclature() {
		tester.setNomenclature("");
		assertEquals(" ", tester.getNomenclature());
	}
	
	@Test
	public void testMemberObj() {
		tester.setMemberObj(new String());
		assertTrue(tester.getMemberObj() instanceof Object);
		
		tester.setMemberObj(new Integer(9));
		assertTrue(tester.getMemberObj() instanceof Integer);
		//tester.setMemberObj(new Integer(9));
		//assertEquals(new Integer(9), tester.getMemberObj());
	}
}
