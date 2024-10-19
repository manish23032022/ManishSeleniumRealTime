package String;

public class reversee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="dfggwe";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--) {
			char ch=s.charAt(i);
			rev=rev+ch;
		}
		System.out.println(rev);
	}

}
