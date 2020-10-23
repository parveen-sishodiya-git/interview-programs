/******************************************************************************

Author List:
	Parveen

Sample I/O:
	Input: '@a#b$$c@*@de%%%@f'
	Output: '@f#e$$d@*@cb%%%@a'
	
	Inout: 'abcdef#$%^&'
	Output: 'fedcba#$%^&'
	
	Input: 'abcdef123456'
	Output: 'fedcba123456'
	
Complexity:
	Time Complexity: O(n)
	Space Complexity: O(n) 

*******************************************************************************/

public class ReverseStringAlphas
{
    static String str = "@a#b$$c@*@de%%%@f";
    static char[] strArray = str.toCharArray();
    
	public static void main(String[] args) {
	    System.out.println(getReversedAlphas(str));
	}
	
	public static String getReversedAlphas(String str){
	    int strLen = str.length();
	    int i = 0;
	    int j = strLen - 1;
	    
	    while(i < j){
	        i = getIindex(i , j);
	        j = getJindex(j , i);
	        swap(i,j);
	        i++;
	        j--;
	    }
	    return String.valueOf(strArray);
	}
	
	public static int getIindex(int i,int j){
	    while(i < j){
	        char ch = strArray[i];
	        if( (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
	            return i;
	        else
	            i++;
	    }
	    return i;
	}
	
	public static int getJindex(int j,int i){
	    while(j > i){
	        char ch = strArray[j];
	        if( (ch > 'a' && ch < 'z') || (ch > 'A' && ch < 'Z'))
	            return j;
	        else
	            j--;
	    }
	    return j;
	}
	
	public static void swap(int i,int j){
	    char temp = strArray[j];
	    strArray[j] = strArray[i];
	    strArray[i] = temp;
	}
	
}