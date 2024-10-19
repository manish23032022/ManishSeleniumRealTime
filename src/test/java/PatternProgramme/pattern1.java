package PatternProgramme;

public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=5;
		int count=5;
		
		for(int i=1;i<=row;i++) {
			int num=5;
			for(int j=1;j<=count;j++) {
				System.out.print(num);
				num--;
			}
			System.out.println();
			//num--;
		}

	}

}
