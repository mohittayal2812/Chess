package MyPack;

public class Array2 {

	public static void main(String[] args) {
		
		int[][] nums=new int[3][4];
		
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<4;j++) {
				nums[i][j] = i+j;
				nums[2][2] = 8;
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
			}
		
	}

}
