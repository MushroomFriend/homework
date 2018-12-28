public class Assign2 {
    
    public static void main(String[] args) {
	System.out.println("Divisible by 3 and 5");
        for (int q = 0; q <=100; q++) {
            int remain5 = q % 5;
            int remain3 = q % 3;
            
            if ((remain5 == 0) && (remain3 == 0)) {
        	System.out.println(q);
        	}
        }
        System.out.println("\nDivisible by 3");
        for (int q = 0; q <=100; q++) {
            int remain3 = q % 3;
            
            if (remain3 == 0) {
        	System.out.println(q);
        	}
        }
        System.out.println("\nDivisible by 5");
        for (int q = 0; q <=100; q++) {
            int remain5 = q % 5;

            if (remain5 == 0) {
        	System.out.println(q);
        	}
        }
    }
}
