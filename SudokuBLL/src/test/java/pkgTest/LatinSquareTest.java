package pkgTest;

import static org.junit.Assert.*;

import org.junit.Test;

import pkgHelper.LatinSquare;

public class LatinSquareTest {
	
	@Test
	public void hasDuplicates_Test() {
		
		int[][] mySquare = {{1,2,3}, {2,3,1}, {3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		int[] myArray = {1,5,2,3};
		
		assertFalse(ls.hasDuplicates(myArray));
		
		myArray[3] = 5;
		assertTrue(ls.hasDuplicates(myArray));
		
		int[] nullArray = null;
		assertFalse(ls.hasDuplicates(nullArray));
	}
	
	@Test
	public void doesElementExist_Test() {
		
		int[][] mySquare = { {1,2,3}, {2,3,1}, {3,2,1} };
		LatinSquare ls = new LatinSquare(mySquare);
		
		int[] myArray = {1,2,3,4,5,6};
		int iValue = 4;
		
		assertTrue(ls.doesElementExist(myArray, iValue));
		
		iValue = 99;
		assertFalse(ls.doesElementExist(myArray,iValue));
		
		myArray[5] = 66;
		iValue = 6;
		assertFalse(ls.doesElementExist(myArray, iValue));
	}
	@Test
	public void ContainsZero_Test() {
		
		int[][] mySquare = { {1,2,3}, {2,3,1}, {3,2,1} };
		LatinSquare ls = new LatinSquare(mySquare);
		assertFalse(ls.ContainsZero());
		
		mySquare[0][1] = 0;
		assertTrue(ls.ContainsZero());
		
		mySquare[2][2] = 0;
		assertTrue(ls.ContainsZero());
		
	}

}
