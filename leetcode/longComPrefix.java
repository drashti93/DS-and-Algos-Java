package leetcode;

public class longComPrefix {

	public static void main(String[] args) {
		String[] strs = {"flower","flow","flight"};
		String newS = longestCommonPrefix(strs);
		System.out.println(newS);

	}

	/*Write a function to find the longest common prefix string 
	 * amongst an array of strings.
	 */

	/*If there is no common prefix, return an empty string "".

	Example 1:

	Input: ["flower","flow","flight"]
	Output: "fl"
	*/
	
	public static String longestCommonPrefix(String[] strs) {
        String temp = strs[0];
        String s = "";
     for(int i = 0; i<strs.length-1; i++){
         for(int j=0; j<temp.length(); j++){
             char c = temp.charAt(j);
             if(j < strs[i+1].length()){
                 char ch = strs[i+1].charAt(j);
                 if(c == ch){
                     s = s+c;
                 }
                 else if(j == 1 && s=="") {
                	 return "";
                 }
             }
         }
         temp = s;
         s="";
         
     }
        
        return temp;
}   
	
}
