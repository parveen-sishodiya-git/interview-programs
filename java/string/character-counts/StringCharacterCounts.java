import java.util.Map;
import java.util.HashMap;
public class StringCharacterCounts
{
	public static void main(String[] args) {
	    String str = "\timport AaaaAAA@#$%@!@#$%^&^%$#@#%^&&^%#@#$%^&^%$#16515665465465#$%^&*AaAaaa";
	    char[] strArray = str.toCharArray();
	    Map<Character,Integer> strMap = new HashMap<Character,Integer>();
	    for(int i=0;i<strArray.length;i++){
	        if(strMap.containsKey(strArray[i])){
	            int previousCount = strMap.get(strArray[i]);
	            strMap.put(strArray[i],++previousCount);
	        }else{
	            strMap.put(strArray[i],1);
	        }
	    }
	    
	    for(Map.Entry entry :strMap.entrySet()){
	        System.out.println(entry.getKey() +" "+ entry.getValue());
	    }
	}
}
