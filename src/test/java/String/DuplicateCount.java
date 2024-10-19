package String;

public class DuplicateCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s="sdfggfdsdfg";
		 //int i=0;
		// int j=0;
		for(int i=0;i<s.length();i++) {
			int count=0;
			char ch1=s.charAt(i);
			
		
			for(int j=0;j<s.length();j++) {
				char ch2=s.charAt(j);
			
				if(ch1==ch2 && i>j) {
					break;
				}
						if(ch1==ch2) {
							count++;
							//break;
						}
			}
//			if(i==j) {    
//				System.out.println(ch1);
//			}
			if(count>0) {
				System.out.println(ch1 + " " +count);
			}
			
		}
	}

}
