package mypack;

public class ReverseWord {

	public static void main(String[] args) {
		String s="Computer.is.fun";
		String[] str = s.split("\\."); 
		String res="";
		for(int i=str.length-1;i>=0;i--) {
			if(i!=0) 
				res +=str[i]+".";
				else 
					res +=str[i];
				}
			System.out.println(res);
			System.out.println("\"ashwini murhade\"");
			}
		
	}


