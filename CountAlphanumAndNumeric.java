package mypack;

import java.util.Scanner;

public class CountAlphanumAndNumeric {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the string you want to check");
		String s=sc.nextLine();
		int k=0 ,l=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='0' && ch<='9') {
				k++;
				
			}else {
			if(ch>='a' && ch<='z'|| ch>='A' && ch<='Z') {
			l++;
				
			}
        
			}
		}
		if(k==0) {
			System.out.println("the string no any numeric");
			
		}else {
			System.out.println("the string have"+k+"numeric");
		}if(l==0) {
			System.out.println("the string no any alphabet");
		}else {
			System.out.println("the string have "+l+"alphabet");
		}
	}

}
