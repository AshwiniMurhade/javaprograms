package mypack;

public class VowelsCount {
 
	public static void main(String[] args) {
		String s="hello hoe are you";
		
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
