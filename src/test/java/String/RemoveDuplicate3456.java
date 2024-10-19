package String;

public class RemoveDuplicate3456 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sdfghjhfds";
		int i=0;
				int j=0;
		
		for(i=0;i<s.length();i++) {
			char ch1=s.charAt(i);
			
			for(j=0;j<s.length();j++) {
				char ch2=s.charAt(j);
				if(ch1==ch2) {
					break;
				}
				
			}
			if(i==j) {     //int i=0 under for loop
				System.out.println(ch1);
			}
		}
	}

}
