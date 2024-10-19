package String;

import org.apache.poi.hssf.record.PageBreakRecord.Break;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String s="msdfggfdsdfdsd";
	       char[] arr=s.toCharArray();
	       
	       for(int i=0;i<arr.length;i++) {
	    	  int count=0;
	    	   for(int j=0;j<arr.length;j++) {
	    		   if(arr[i]==arr[j] && i>j) {
	    			   break;
	    			  }
	    		   if(arr[i]==arr[j]) {
	    			   count++;
	    		   }
	    	   }
	       if(count>0) {
	    	   System.out.println(arr[i] + " " + count);
	       }
	       }

	}

}
