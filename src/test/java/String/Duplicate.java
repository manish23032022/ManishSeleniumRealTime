package String;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="sdfghgfds";
		int i,j;
	    char[] arr=s.toCharArray();
	    for(i=0;i<arr.length;i++) {
	    	for(j=0;j<arr.length;j++) {
	    		if(arr[i]==arr[j]) {
	    			break;
	    		}
	    	}
	    	if(i==j) {
	    		System.out.println(arr[i]);
	    	}
	    }
		
//		String s="sdfghgfds dfghj dfghj";
//		int i,j;
//		int count;
//	    char[] arr=s.toCharArray();
//	    for(i=0;i<arr.length;i++) {
//	    	count=0;
//	    	for(j=0;j<arr.length;j++) {
//	    		if(arr[i]==arr[j] && arr[i]!=' ' ) {
//	    			arr[j]=' ';
//	    			count++;
//	    		}
//	    	}
//	    	if(arr[i]!=' '){
//	    		System.out.println(arr[i]+ " : "+count);
//	    	}
//	    	
//	    }
		
		

	}

}
