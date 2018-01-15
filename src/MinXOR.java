import java.util.Arrays;

public class MinXOR {
	public int findMinXor(int[] A) {
        Arrays.sort(A);
        int minXORValue = Integer.MAX_VALUE;
        int xorValue = 0;
        for(int i=0;i<A.length-1;i++){
            xorValue = A[i] ^ A[i+1];
            minXORValue = Math.min(minXORValue, xorValue);
        }
        return minXORValue;
    }
}
