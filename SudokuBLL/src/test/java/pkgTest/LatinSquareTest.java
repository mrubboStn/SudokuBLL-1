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
		
		int[] newArray = {1,5,5,2};
		assertTrue(ls.hasDuplicates(newArray));
		
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
	@Test
	public void hasAllValues_Test() {
		
		int[][] mySquare = { {1,2,3}, {2,3,1}, {3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		int[] targetArray = {1,3,2};
		int[] sourceArray = {1,2,3};
		
		assertTrue(ls.hasAllValues(targetArray, sourceArray));
		
		sourceArray[2] = 4;
		assertFalse(ls.hasAllValues(targetArray, sourceArray));
		
		int[] largeArray = {1,2,3,4};
		assertTrue(ls.hasAllValues(largeArray, targetArray));
	}
	
	@Test
	public void getColumn_Test() {
		
		int[][] mySquare = { {1,2,3}, {4,5,6}, {7,8,9}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		int[] myArray = {1,4,7};
		assertArrayEquals(ls.getColumn(0), myArray);
}
	
	@Test
	public void getRow_Test() {
		
		int[][] mySquare = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		int[] arr1 = {1,2,3,4};
		assertArrayEquals(ls.getRow(0), arr1);
		
		int[] arr2 = {13,14,15,16};
		assertArrayEquals(ls.getRow(3), arr2);
		
		int[][] smallSquare = {{6,5,4}, {6,5,5} , {0,100,3}};
		LatinSquare smallLS = new LatinSquare(smallSquare);
		
		int[] arr3 = {0,100,3};
		assertArrayEquals(smallLS.getRow(2), arr3);
	}
	
	@Test
	public void isLatinSquare_Test() {
		
		int[][] mySquare = {{1,2,3}, {2,3,1}, {3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		assertTrue(ls.isLatinSquare());
		
		int[][] wrongSquare = {{1,2,3}, {4,5,6}, {7,8,9}};
		LatinSquare wrongLS = new LatinSquare(wrongSquare);
		
		assertFalse(wrongLS.isLatinSquare());
		
		int[][] duplicateSquare = {{1,2,1}, {1,2,1}, {2,1,2}};
		LatinSquare duplicateLS = new LatinSquare(duplicateSquare);
		
		assertFalse(duplicateLS.isLatinSquare());
		
		int[][] largeSquare = {{1,2,3,4,5}, {2,3,4,5,1}, {3,4,5,1,2}, {4,5,1,2,3}, {5,1,2,3,4}};
		LatinSquare largeLS = new LatinSquare(largeSquare);
		
		assertTrue(largeLS.isLatinSquare());
	}
	
	@Test
	public void setLatinSquare_Test() {
		
		//This also should double as a test for getLatinSquare due to the method's call in the assertArrayEquals
		
		int[][] mySquare = {{1,2,3}, {2,3,1}, {3,1,2}};
		LatinSquare ls = new LatinSquare(mySquare);
		
		int[][] newSquare = {{3,1,2}, {2,3,1}, {1,2,3}};
		ls.setLatinSquare(newSquare);
		
		assertArrayEquals(ls.getLatinSquare(), newSquare);
		
		int[][] largeSquare = {{1,1,1,1}, {2,2,2,2}, {3,3,3,3}, {4,4,4,4}};
		ls.setLatinSquare(largeSquare);
		
		assertArrayEquals(ls.getLatinSquare(), largeSquare);
		
		int[][] smallSquare = {{1,2}, {3,4}};
		ls.setLatinSquare(smallSquare);
		
		assertArrayEquals(ls.getLatinSquare(), smallSquare);
	}
}
