package String;

public class Duplicate22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b="bgdgbdg cfghj fghj jhgf";
		
	String s1=	b.replaceAll("\\s", "");
	System.out.println(s1);
	char[] ch =s1.toCharArray();
	int i,j;
	for(i=0;i<ch.length;i++) {
		for(j=0;j<ch.length;j++) {
			if(ch[i]==ch[j]) {
				break;
			}
		} 
		if(i==j) {
			System.out.println(ch[i]);
		}
		
	}
		
		
		
//		  String s="razamd";
//	        char[] ch=s.toCharArray();
//	        int i,j;
//	        for(i=0;i<ch.length;i++) {
//	        	for(j=0;j<ch.length;j++) {
//	        		if(ch[i]==ch[j]) {
//	        			break;
//	        		}
//	        	}
//	        if(i==j) {
//	        	System.out.print(ch[i]);
//	        }
//	        }
//	
	}

}
