public class tryagain {
    public static void main(String[] args) {
	for (int q = 0; q <= 100; q++) {
	    int remain3 = q % 3;

	    if (remain3 == 0) {
		int i = q;

		int[] myList = {i};

		// Print all the array elements
		for (int element: myList) {
		    System.out.println(element);
		}
	    }
	}
    }
}

/*
public class tryagain {
public static void main(String[] args) {
	int[] resultList = new int[34];
	int resultIndex = 0;
	for (int q = 0; q <= 100; q++) {
	    int remain3 = q % 3;

	    if (remain3 == 0) {
		resultList[resultIndex] = q;
		resultIndex = resultIndex + 1;

	    }
	}
	// Print all the array elements
	for (int element: resultList) {
	    System.out.println(element);
	}
}
*/