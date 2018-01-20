import java.util.ArrayList;

public class PalindromePartitioning {
	public ArrayList<ArrayList<String>> partition(String a) {
	    ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
	    palindrome(result, new ArrayList<String>(), a, 0);
	    return result;
	}
	public void palindrome(ArrayList<ArrayList<String>> result, ArrayList<String> list, String a, int start){
	    if(start == a.length()){
	        result.add(new ArrayList<String>(list));
	    }
	    else{
	        for(int i=start;i<a.length();i++){
	            if(isPalindrome(a, start, i)){
	                list.add(a.substring(start, i+1));
	                palindrome(result, list, a, i+1);
	                list.remove(list.size()-1);
	            }
	        }
	    }
	}
	public boolean isPalindrome(String a, int low, int high){
	    while(low<high){
	        if(a.charAt(low++) != a.charAt(high--)){
	            return false;
	        }
	    }
	    return true;
	}
}
