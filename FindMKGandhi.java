package mypack;

public class FindMKGandhi {

	public static void main(String[] args) {
		//program to find m.k.gandhi
		String s="Mohandas Karamchand Gandhi";
		String s1="";
		String s2="";
				
		for(int i=0;i<s.length();i++) {
			if(i==0) {
				s1=s1+s.charAt(i)+".";
				System.out.print(s.charAt(i)+".");
			
				
				}
			
			else if(s.charAt(i)==' ') {
				s1=s1+s.charAt(i+1)+".";
				System.out.print(s.charAt(i+1)+".");
				break;
				
			}
			
			
		}
		System.out.print(s.substring(19));
	}

}

	


