package mypack;

public class SpiltExample {

	public static void main(String[] args) {
		String s="Computer is Fun";
		String sp[]=s.split(" ");
		System.out.println();
        for(int i=sp.length-1;i>=0;i--) {
        	System.out.print(sp[i]);
        }
        	
	}

}

