package mypack;

public class StringlengthCharVowelsWords {

	public static void main(String[] args) {
		String s="hello how are you";
		System.out.println("number of characters ="+s.length());
		System.out.println("Characters at 2nd position"+s.charAt(1));
		System.out.println("last character "+s.charAt(s.length()-2));
		
		//program to find number of vowels a,e,i,o,u
		int c=0;
		for(int i=0;i<s.length();i++) {
			char ch= s.charAt(i);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U'){
					c++;
				
				}
			}
			System.out.println("number of vowels="+c);
		}
		
}


