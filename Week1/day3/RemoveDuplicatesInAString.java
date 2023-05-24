package Week2.day3;

public class RemoveDuplicatesInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text= "We learn java basics as part of java sessions in java week1";
		int count;
		char text1[] = text.toCharArray();
		for (int i=0;i<text1.length;i++)
		{
			for (int j=0;j<text1.length;j++) {
				if (text1[i]==text1[j])
						{
					System.out.println(text1[i]);
						}
			}
				
				
		}
		
		
	}

}
