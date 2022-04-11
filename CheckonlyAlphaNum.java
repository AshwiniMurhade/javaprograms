package mypack;

public class CheckonlyAlphaNum {

	public static void main(String[] args) {
		String s="123";
        boolean flag=false;
        for(int i=0;i<s.length();i++)
        	
        {
        	char ch=s.charAt(i);
        	if(ch>='A' && ch<='Z'|| ch>='a' && ch<='z') {
        		
        		flag=true;
        		
        	}
        	
        	}
        	
        
        if(flag==true) {
        	System.out.println("only for alphabet");
        	
        }
        else {
        	System.out.println("alphanumeric");
        }
        


	}

}
