/******************************************************************************

Author List:
	Parveen,
	You can also contribute with giving solutions to existing problem or add a new one.   

Program to reverse the words in the given sentence.

Sample I/O:
	Input	: 'please reverse my words only'
	Output	: 'esaelp esrever ym sdrow ylno'
	
	Inout	: 'abcd efgh'
	Output	: 'dcba hgfe'
	
Complexity:
	Time Complexity: O(n)
	Space Complexity: O(1) 

*******************************************************************************/
import java.util.Scanner;
class ReverseWordsInSentence
{    
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter a sentence:");
	  String sentence = scan.nextLine();
	  System.out.println(reverseWords(sentence));
	}
	
	static String reverseWords(String sentence){
		char[] sentenceChars = sentence.toCharArray();
		char space = ' ';
		int leftIndex = -1;
		int rightIndex = -1;
		for(int i=0;i<sentenceChars.length;i++){
			if(leftIndex == -1){
				if(sentenceChars[i] == space)
					continue;
				leftIndex = i;
			}
			rightIndex = i;
			if(sentenceChars[rightIndex] == space){
				rightIndex--;
				if(leftIndex<rightIndex)
					sentenceChars = swap(sentenceChars,leftIndex,rightIndex);
				leftIndex = -1;
				rightIndex = -1;
			}else if(rightIndex == (sentenceChars.length - 1)){
				if(leftIndex<rightIndex)
					sentenceChars = swap(sentenceChars,leftIndex,rightIndex);
			}	
		}
		return String.valueOf(sentenceChars);
	}
	
	static char[] swap(char[] sentenceChars,int leftIndex,int rightIndex){
		char temp;
		while(leftIndex < rightIndex){
			temp = sentenceChars[rightIndex];
			sentenceChars[rightIndex] = sentenceChars[leftIndex];
			sentenceChars[leftIndex] = temp;
			leftIndex++;
			rightIndex--;
		}
		return sentenceChars;
	}
}


