package CS245TwoSum;

public class KLists {
	static double[][] outerArray = {{1.1, 4.4, 5.5}, {1.1, 3.3, 4.4}, {2.2, 6.6}};
	static double[] outputArray = new double[8];
	//output should be {1.1, 1.1, 2.2, 3.3, 4.4, 4.4, 5.5, 6.6}
	//[x][y], x = which element, y = element within element
	// X = {1.1, 4.4, 5.5}, y = 1.1
	
	public static void main(String[] args) {
		
		
	}
	
	public static double [] mergeKLists(double[][] outerArray) {
		int[] arrayOfIndex = new int[outerArray.length];
		int smallestElementIndex = 1;
		
		while(moreElementsLeft(outerArray, arrayOfIndex)) {
			for (int i = 0; i < arrayOfIndex.length; i++) {
				double smallestElement = outerArray[smallestElementIndex][arrayOfIndex[smallestElementIndex]];
				double currentElement = outerArray[i][arrayOfIndex[i]];
				if (smallestElement > currentElement) {
					arrayOfIndex[smallestElementIndex]--;
					arrayOfIndex[i]++;
					smallestElementIndex = i;
				}
			}
		}
		for (int h = 0; h < arrayOfIndex.length; h++) {
			System.out.println(arrayOfIndex[h]);
		}
		return new double[] {-1.0};
	}
	
	public static boolean moreElementsLeft(double[][] arr, int[] arrIndex) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].length-1 != arrIndex[i]) {
				return true;
			}
		}
		
		return false;
	}

}
