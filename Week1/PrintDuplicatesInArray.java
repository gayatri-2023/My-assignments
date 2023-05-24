package Week2.day3;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		int len=arr.length;
		int count=0;
		
		for (count=0;count<=len-1;count++)
		{
			for (int i=count+1;i<len;i++) {
				if (arr[count]==arr[i])
				{
					System.out.println(arr[count]);
				}
			}
				
		}
	}

}
