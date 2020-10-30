/******************************************************************************

Author List:
	Parveen,
	You can also contribute with giving solutions to existing problem or add a new one.   

Sample I/O:
	Input	: '46387648'
	Output	: 'String contains only numbers.'
	
	Inout	: '7n378d'
	Output	: 'String does't contains only numbers.'
	
Complexity:
	Time Complexity: O(n)
	Space Complexity: O(1) 

*******************************************************************************/

class StringOnlyNumbers
{    
	public static void main (String[] args) throws java.lang.Exception
	{
	  String str = "89374u43";
	  if(isOnlyNumbers(str))
		  System.out.println("String contains only numbers.");
	  else
		  System.out.println("String does't contains only numbers.");
	}
	
	static boolean isOnlyNumbers(String str){
		for(int i=0;i<str.length();i++){
			int j = Integer.valueOf(str.charAt(i));
			if(!(j>47 && j<58))
				return false;
		}
		return true;
	}
}
