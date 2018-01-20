
public class Numberof1Bits {
	public int numSetBits(long a) {
	    long count = 0;
	    while(a!=0){
	        count = count + (a & 1);
	        a = a>>>1;
	    }
	    int ans = Long.valueOf(count).intValue();
	    return ans;
	}
}
