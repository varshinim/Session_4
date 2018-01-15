
public class SingleNumber {
	public int singleNumber(final int[] A) {
        int ans = A[0];
        for(int i=1;i<A.length;i++){
            ans = ans ^ A[i];
        }
        return ans;
    }
}
