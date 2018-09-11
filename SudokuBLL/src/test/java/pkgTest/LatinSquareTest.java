package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgHelper.LatinSquare;

public class LatinSquareTest {

	@Test
	public void ContainsZeroTest_Test() {
		
		int[][] mySquare = { {1,2,3}, {2,3,1}, {3,2,1} };
		LatinSquare ls = new LatinSquare(mySquare);
		assertFalse(ls.ContainsZero());
		
		mySquare[0][1] = 0;
		assertTrue(ls.ContainsZero());
		assertEquals(true, ls.ContainsZero());
		
	}
	
	@Test
	public void doesElementExist_Test() {
		
		int[][] mySquare = { {1,2,3}, {2,3,1}, {3,2,1} };
		LatinSquare ls = new LatinSquare(mySquare);
		
		int[] myArray = {1,2,3,4,5,6};
		int iValue = 4;
		
		assertTrue(ls.doesElementExist(myArray, iValue));
		
		iValue = 99;
		
		assertTrue(ls.doesElementExist(myArray,iValue));
		
	}

}
