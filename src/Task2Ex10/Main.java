package Task2Ex10;

public class Main {

    public static void main(String[] args) {
	System.out.println("    1  2  3  4  5  6  7  8  9  10");
	int i = 1;

	while   (i<=10) {
	    System.out.print( i + " | ");
	    int j = 1;

	    while (j<=10){
	        int ot = i*j;
	        if (ot<10)
	            System.out.print(ot + "  ");
	        else
	            System.out.print(ot + " ");
	        j++;

        }
	    System.out.println();
	    i++;
    }
    }
}
