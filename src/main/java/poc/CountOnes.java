package poc;

public class CountOnes {
	
	/*Given a sorted binary array, find the number of 1’s
		{0,0,0,1,1,1,1} => {0,0,1},1 {1,1,1} => {0,1,1,1} => {0, 1}, {1, 1} =>
		
		 {0,0,1} => {0}, 0
		Answer should be 4 for this */
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{0,0,0,0,0,0,0};
		
		int startIndex = searchForOne(arr, 0, arr.length - 1);
		System.out.println(arr.length - startIndex);
		
	}
	
	public static int searchForOne(int arr[], int start, int end) {
		if(end - start <= 1) {
			return end;
		}
		if(arr[(start + end) / 2] == 1) {
			return searchForOne(arr, start, (start + end) / 2);
			
		}else {
			return searchForOne(arr, (start + end) / 2, end);
		}
		
	}

}



