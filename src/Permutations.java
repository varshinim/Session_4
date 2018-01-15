import java.util.ArrayList;

public class Permutations {
	public int[][] permute(int[] A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        permutation(result, new ArrayList<Integer>(), A);
        ArrayList<Integer> temp;
        int n = result.size();
        int[][] ans = new int[n][];
        for(int i=0;i<n; i++){
        	temp = result.get(i);
        	ans[i] = new int[temp.size()];
            for(int j=0;j<temp.size(); j++){
            	ans[i][j] = temp.get(j);
            }
        }
        return ans;
    }
    private void permutation(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, int[] A){
        if(list.size()==A.length){
            result.add(new ArrayList<Integer>(list));
        }
        else{
            for(int i=0;i<A.length;i++){
                if(list.contains(A[i])) continue;
                list.add(A[i]);
                permutation(result, list, A);
                list.remove(list.size()-1);
            }
        }
    }
}
