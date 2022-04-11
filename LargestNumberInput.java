package third;

public class LargestNumberInput { 
public static void main(String args[]) {
	int a=2,b=3,c=3,d=5;
	int large;
	large = ( a>b && a>c && a>d)?a:d;
	System.out.println("the largest of " +a+ "," +b+ "," +c+ " and "  +d+  " is "  +large);

}
}   	