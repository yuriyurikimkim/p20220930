package co.edu.except;

public class RectPrint {
	public static void main(String[] args) {
		int [][]num = new int[5][5];
		int i;
		int j;
		int result = 0;
		
		for (i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				result = result+1;
				num[j][i]=result;
			}
		}
		
		for(i=0; i<5; i++) {
			for(j=0; j<5; j++) {
				System.out.printf("%3d",num[i][j]);
			}System.out.println();
		}
	}
}
