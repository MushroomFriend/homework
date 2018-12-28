import java.util.Scanner;

public class example
{
    public boolean isDivisibleBy2(float number) {
	float b = number % 2;
	if( b == 0) {
	    return true;
	} else {
	    return false;
	}
	
    }
    
    public void loopThrough100() {
	for( int i=0; i <=100; i++) {
	    System.out.println(i);
	}
    }
    
    public static void main(String[] args) {
	System.out.print("Enter an integer: ");
	Scanner reader = new Scanner(System.in);
	float n = reader.nextFloat();
	
	example ex = new example();
	boolean check = ex.isDivisibleBy2(n);
	System.out.println("Is " + n + " divisible by 2? " + check);
	
	ex.loopThrough100();
    }
     
}