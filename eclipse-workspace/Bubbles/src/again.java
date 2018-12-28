public class again {
    public static void main(String[] args) {
	System.out.print("Divisible by 3: ");
	int[] resultList = new int[34];
	int resultIndex = 0;
	for (int q = 0; q <=100 ; q++) {
	    int remain3 = q%3;
	    
	    if (remain3 == 0) {
		resultList[resultIndex] = q;
		resultIndex = resultIndex + 1;
	    }
	}
	System.out.println(String.valueOf(resultIndex) + " numbers.");
	for (int element: resultList) {
	    System.out.print(element + " ");
	}
	System.out.println();
	
	System.out.print("\nDivisible by 5: ");
	int[] resultList2 = new int[21];
	int resultIndex2 = 0;
	for (int q = 0; q <=100 ; q++) {
	    int remain3 = q%5;
	    
	    if (remain3 == 0) {
		resultList2[resultIndex2] = q;
		resultIndex2 = resultIndex2 + 1;
	    }
	}
	System.out.println(String.valueOf(resultIndex2) + " numbers.");
	for (int element: resultList2) {
	    System.out.print(element + " ");
	}
	System.out.println();
	
	System.out.print("\nDivisible by 3 and 5: ");
	int[] resultList3 = new int[7];
	int resultIndex3 = 0;
	for (int q = 0; q <=100 ; q++) {
	    int remain3 = q%3;
	    int remain5 = q%5;
	    
	    if ((remain3 == 0) && (remain5 ==0)) {
		resultList3[resultIndex3] = q;
		resultIndex3 = resultIndex3 + 1;
	    }
	}
	System.out.println(String.valueOf(resultIndex3) + " numbers.");
	for (int element: resultList3) {
	    System.out.print(element + " ");
	}
	System.out.println();
    }
}