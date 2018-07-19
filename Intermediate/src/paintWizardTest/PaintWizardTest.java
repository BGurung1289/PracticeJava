package paintWizardTest;

import static org.junit.Assert.*;

import org.junit.Test;

import paintWizard.paintWiz;

public class PaintWizardTest {
	
	
	@Test
	public void testPaint() {

		paintWiz testWiz = new paintWiz();
		
		assertEquals("not added",testWiz.getPaint(0).getName() ,"Cheapo Paint" );
		
	}
	
	
	
	@Test
	public void testCheapestTotalPaint() {
		
		paintWiz testWiz = new paintWiz();
		
		assertEquals("no work",testWiz.cheapestTotalPaint(),17.99,0);
		
	}
	
	@Test
	public void testAvailablePaints(){

		paintWiz testWiz = new paintWiz();
		
		assertEquals("no paints",testWiz.getAvailablePaints(),3);
	}

	@Test
	public void testcheapestPaintArea() {

		paintWiz testWiz = new paintWiz();
		
		assertEquals("not working",testWiz.cheapestPaintArea(200).getName(),"Cheapo Paint");
	}
}
