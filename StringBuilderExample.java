package mypack;

public class StringBuilderExample {

	
	public static void main(String[] args) {
		StringBuilder strSB = new StringBuilder("This is an example of");
		strSB.append("append method.");
		System.out.println(strSB);
		
		StringBuilder strSB1 = new StringBuilder("This is a Program");
		strSB1.insert(10,"java");
		System.out.println(strSB1);

		StringBuilder strSB2 = new StringBuilder("This is a Program");
		strSB2.replace(0,9, "java");
		System.out.println(strSB2);
		
		StringBuilder strSB3 = new StringBuilder("This is a Program");
		strSB3.delete(0, 10);
		System.out.println(strSB3);

		StringBuilder strSB4 = new StringBuilder("This is a Program");
		strSB4.reverse();
		System.out.println(strSB4);

		StringBuilder strSB5 = new StringBuilder("This is a Program");
		strSB5.deleteCharAt(6);
		System.out.println(strSB5);

		StringBuilder strSB6 = new StringBuilder("This is a Program");
		strSB6.setCharAt(8, 'n');
		System.out.println(strSB6);


	}

	
	}
 
		


