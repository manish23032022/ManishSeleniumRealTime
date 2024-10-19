package String;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dasdg";
		String rev="";
		 
			for(int i=s.length()-1;i>=0;i--) {
				char ch=s.charAt(i);
				rev=rev+ch;
			//System.out.println(rev);
			}
			System.out.println(rev);
//		String s="razamd";
//	       String s1="";
//	     
//	       for(int i=s.length()-1;i>=0;i--) {
//	    	   s1=s1+s.charAt(i);
//	       }
//		System.out.println(s1);
	}

}
