/******************************************************************************

Author List:
	Parveen,
	You can also contribute with giving solutions to existing problem or add a new one.  

Sample I/O:
	Input: 'stardum'
	Output: 'mudrats'
	
Complexity:
	Time Complexity: O(n)
	Space Complexity: O(n) 

*******************************************************************************/

public class ReverseString
{
	public static void main(String[] args) {
	    String str = "abcdefgh";
		System.out.println(getReversedString(str));
	}
	
	public static String getReversedString(String str){
	    int strLen = str.length();
	    char[] strArray = str.toCharArray();
	    char temp;
	    for(int i = 0; i <= ((strLen-1)/2); i++){
	       temp = strArray[i];
	       strArray[i] = strArray[strLen - 1 - i];
	       strArray[strLen - 1 - i] = temp;
	    }
	    return String.valueOf(strArray);
	}
	
}