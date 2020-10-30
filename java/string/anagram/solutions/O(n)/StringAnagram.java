/******************************************************************************

Author List:
	Parveen,
	You can also contribute with giving solutions to existing problem or add a new one.   

Sample I/O:
	Input	: 'abcdef'
	Output	: 'bfaedc'
	
	Inout	: 'Listen'
	Output	: 'Silent'
	
Complexity:
	Time Complexity: O(n)
	Space Complexity: O(n) 

*******************************************************************************/

import java.util.Arrays;
class StringAnagram{
	public static void main(String[] params){
		String str1 = "ABCDEF";
		String str2 = "BFAEDC";
		
		/*for(int i=0; i<=256; i++){
	        System.out.println((char)i+" = "+i);
	    }*/
		
		if(getStringAnagram(str1,str2)){
			System.out.println("String are anagram");
		}else{
			System.out.println("String are not anagram");
		}
		
	}
	
	static boolean getStringAnagram(String str1,String str2){
		if(str1.length() != str2.length())
			return false;
		
		//main code for anagram
		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		
		Arrays.sort(str1Array);
		Arrays.sort(str2Array);
		
		for(int i = 0; i < str1Array.length; i++){
			if(str1Array[i] != str2Array[i])
				return false;
		}
		
		return true;
	}
}