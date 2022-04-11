package mypack;

public class MKGPgm {

	public static void main(String[] args) {
		//program to print M. k.g.
		String s="Mohandas Karamchand Gandhi";
		String st="";
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				st=st+s.charAt(i)+".";
				
			}
			else if(s.charAt(i)==' ') {
				st=st+s.charAt(i+1)+".";
			}
		}
		System.out.println(st);
	}

}
