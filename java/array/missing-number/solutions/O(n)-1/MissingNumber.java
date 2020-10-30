/******************************************************************************

Author List:
	Parveen,
	You can also contribute with giving solutions to existing problem or add a new one.   

Sample I/O:
	Input: [2,1,9,6,4,3,8,5]
	Output: 7 //As seven is missing.
	
Complexity:
	Time Complexity: O(n)
	Space Complexity: O(1) 

*******************************************************************************/

class MissingNumber
{
    public static int getMissingNumber(int arr[], int len){
       int sum = (len+1)*(len + 2)/2;
       for(int i=0;i<len;i++){
           sum -= arr[i];
       }
       return sum;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    int arr[] = {2,1,9,6,4,3,8,5};
	    int missedNum = getMissingNumber(arr,arr.length);
	    System.out.println(missedNum);
	}
}
