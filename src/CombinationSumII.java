import java.util.ArrayList;
import java.util.Collections;

public class CombinationSumII {
	public ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> a, int b) {
	    Collections.sort(a);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        combination(result, new ArrayList<Integer>(), a, b, 0);
        return result;
    }
    private void combination(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, ArrayList<Integer> a, int b, int c){
        if(b<0){
            return;
        }
        else if(b==0){
            result.add(new ArrayList<Integer>(list));
        }
        else if(b>0){
            for(int i=c;i<a.size();i++){
                if(i>c && a.get(i) == a.get(i-1)) continue;
                list.add(a.get(i));
                combination(result, list, a, b-a.get(i), i+1);
                list.remove(list.size()-1);
            }
        }
	}
}
