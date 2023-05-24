package Week2.day3;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "changeme";
		char charArray[]=test.toCharArray();
		for (int i=0;i<charArray.length;i++)
		{
			
		if (i%2!=0)
		{
			//System.out.println(charArray[i]);
			 charArray[i]=Character.toUpperCase(charArray[i]);
			 System.out.print(charArray[i] );
			// System.out.println(charArray[i] );
		}
		else
			 System.out.print(charArray[i] );

	}

	}
}
