package pkgHelper;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] myLatinSquare;
	
	public LatinSquare() {
		
	}
	
	public LatinSquare(int[][] latinSquare) {
		super();
		myLatinSquare = latinSquare;
	}

	public int[][] getLatinSquare() {
		return myLatinSquare;
	}

	public void setLatinSquare(int[][] latinSquare) {
		myLatinSquare = latinSquare;
	}
	
	public boolean hasDuplicates(int [] arr) {
		
		if (arr == null)
			return false;
		
		Arrays.sort(arr);
		
		for (int i = 0; i< (arr.length - 1); i++) {
			if (arr[i] == arr[i + 1]); {
				return true;
			}
		}	
		return false;
	}
	
	public boolean doesElementExist(int[] arr, int iValue) {
		
		for (int i = 0 ; i < arr.length ; i++) {
			if (arr[i] == iValue) {
				return true;
			}
		}
		return false;
	}
	
	public boolean ContainsZero() {
		
		for (int iCol = 0; iCol < myLatinSquare.length;iCol++) {
			for (int iRow = 0; iRow < myLatinSquare.length; iRow++) {
				if (myLatinSquare[iCol][iRow] == 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean hasAllValues(int[] arr1, int[] arr2) {
		
		for (int i = 0; i < arr2.length; i++) {
			if (doesElementExist(arr1, arr2[i]) == false)
				return false;
			
		}
		return true;
	}
	
	public int[] getColumn(int iCol) {
		
		int[] intColumn = new int[myLatinSquare.length];
		for (int iColumn = 0 ; iColumn < myLatinSquare.length ; iColumn++) {
			intColumn[iColumn] = myLatinSquare[iColumn][iCol];
		}
		return intColumn;
	}
	
	public int[] getRow(int iRow) {
		
		int[] intRow = new int[myLatinSquare.length];
		for (int iR = 0; iR < myLatinSquare.length; iR++) {
			intRow[iR] = myLatinSquare[iRow][iR];
		}
		return intRow;
	}
	
	public boolean isLatinSquare() {
		
		for (int i = 0; i < myLatinSquare.length; i++) {
			if (hasAllValues(getRow(i), getRow(0)) == false || 
					(hasAllValues(getColumn(i), getColumn(0))) == false) {
				return false;
			}	
			if (hasDuplicates(getRow(i)) == false || hasDuplicates(getColumn(i)) == false) {
				return false;
			}
		}
		return true;		
	}
}

