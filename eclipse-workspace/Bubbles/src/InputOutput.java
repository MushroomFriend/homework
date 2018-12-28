import java.util.Scanner;

public class InputOutput
{
    public int getInputInt() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int n = reader.nextInt();
        System.out.print("\nYou have just entered: ");
        System.out.println(n);
        return n;
    }

    public String getInputStr() {
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String s = reader.nextLine();
        System.out.print("\nYou have just entered: ");
        System.out.println(s);
        return s;
    }
    
    public static void main(String[] args) {
	InputOutput inout = new InputOutput();
	int number = inout.getInputInt();
	String str = inout.getInputStr();
	
	String p1 = "* * * * * * ==================================\n * * * * *  ==================================";
	  String p2 = "==============================================";
	  for (int i = 0; i < 4; i++) {
	   System.out.println(p1);
	}
	String o = number + ", " + str;
	System.out.println(o);
	
	System.out.println("* * * * * * ==================================");
	  for (int i = 0; i < 6; i++) {
	   System.out.println(p2);
    }
    }
}