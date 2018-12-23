package leetcode;


public class JwlsAndStns {

	public static void main(String[] args) {
		String J = "aA";
		String S = "aAAbbbb";
		int newS = numJewelsInStones(J, S);
		System.out.println(newS);

	}
	
	/*You're given strings J representing the types of stones that 
	are jewels, and S representing the stones you have.  
	Each character in S is a type of stone you have.  
	You want to know how many of the stones you have are also jewels.*/

	/*The letters in J are guaranteed distinct, and all characters 
	 * in J and S are letters. Letters are case sensitive, so "a" is 
	 * considered a different type of stone from "A"
	 */
	
	static int numJewelsInStones(String J, String S) {
        int count = 0;
        char[] jewels = J.toCharArray();
        char[] stones = S.toCharArray();
        for(int i= 0; i<jewels.length; i++){
            for(int j=0; j<stones.length; j++){
                if(stones[j] == jewels[i]){
                    count++;
                }
            }
        }
        return count;
    }

}
