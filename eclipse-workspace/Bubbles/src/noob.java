
public class noob {
    public static void main (String[] args) 
    { 
	int[] arr = new int[2]; 
	for (int q = 0; q <=100; q++) {
	    int remain3 = q % 3;
	    if (remain3 == 0) {
		arr[0] = q;
	    }
	}
	for (int w = 0; w <=100; w++) {
	    int remain5 = w % 5;
	    if (remain5 == 0) {
		arr[1] = w;
	    }
	}
	for (int i = 0; i < arr.length; i++) {
	    System.out.println(arr[i]); 
	}
    } 
}
