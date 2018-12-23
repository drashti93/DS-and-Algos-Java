package leetcode;

public class UniqueEmails {

	public static void main(String[] args) {
		
		String[] strs = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
		int newS = numUniqueEmails(strs);
		System.out.println(newS);
	}

	/*Every email consists of a local name and a domain name, separated 
	 * by the @ sign.

	For example, in alice@leetcode.com, alice is the local name, 
	and leetcode.com is the domain name.

	Besides lowercase letters, these emails may contain '.'s or '+'s.

	If you add periods ('.') between some characters in the local 
	name part of an email address, mail sent there will be forwarded 
	to the same address without dots in the local name.  
	For example, "alice.z@leetcode.com" and "alicez@leetcode.com" forward 
	to the same email address.  (Note that this rule does not apply for 
	domain names.)

	If you add a plus ('+') in the local name, everything after the first 
	plus sign will be ignored. This allows certain emails to be filtered, 
	for example m.y+name@email.com will be forwarded to my@email.com.  
	(Again, this rule does not apply for domain names.)

	It is possible to use both of these rules at the same time.

	Given a list of emails, we send one email to each address in the list.  
	How many different addresses actually receive mails? 

	 

	Example 1:

	Input: ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com"
	,"testemail+david@lee.tcode.com"]
	Output: 2
	Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" 
	actually receive mails
	*/
	
public static int numUniqueEmails(String[] emails) {
        
        int count = 0;
        String temp,temp1,s[] = new String[emails.length];
        for(int i=0; i<emails.length; i++){        
                temp=emails[i].substring(0,emails[i].indexOf("@"));
                if(temp.contains("+")) {
                	temp=temp.substring(0, temp.indexOf("+"));
                }
                if(temp.contains(".")){
                    for(int j=0; j<temp.length(); j++){
                    	if(temp.contains(".")) {
                        if(emails[i].charAt(j) == '.'){
                        temp = temp.replace(".", "");
                    }
                    	}
                    	else {
                    		break;
                    	}
                }
            }
                
          temp1=emails[i].substring(emails[i].indexOf("@")+1, emails[i].length()-1);
           s[i]=temp+"@"+temp1; 
            }
        
      
        	for(int i = 0; i<s.length; i++) {
        		if(s[i] != "") {
        		for(int j=i+1; j<s.length;j++) {
        			if(s[j] != "") {
        			if(s[i].equals(s[j])) {
        				s[j] = "";
        			}
        			}
        		}
        		}
        	}
        	
        	for(int i=0; i<s.length; i++) {
        		if(s[i] != "") {
        			count++;
        		}
        	}
        
        return count;
    }
}
