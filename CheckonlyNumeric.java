package mypack;

public class CheckonlyNumeric {

	public static void main(String[] args) {
		String s="hello";
        boolean flag=false;
        for(int i=0;i<s.length();i++)
        	
        {
        	char ch=s.charAt(i);
        	if(ch>=65 && ch<=90|| ch>=97 && ch<=122) {
        		
        		flag=true;
        		
        	}
        	
        	}
        	
        
        if(flag==true) {
        	System.out.println("only for Numeric");
        	
        }
        else {
        	System.out.println("alphabet");
        }
        


	}



	

}
