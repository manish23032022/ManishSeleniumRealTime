package String;

public class Ascii {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="1aAwert543";
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			System.out.println(c + " Ascii "+ (int)c);
		}
	}

}
