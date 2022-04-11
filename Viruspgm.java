package mypack;

import java.util.Scanner;

public class Viruspgm {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String n=sc.nextLine();
		for(int i=0;i<n.length();i++) {
			if(i==0) {
				System.out.print(n.charAt(0)+"");
				
			} 
			else if(n.charAt(i)==' ') {
				System.out.print(n.charAt(i+1)+"");
			}
		}
		
	}

}
