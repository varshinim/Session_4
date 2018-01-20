
public class ReverseBits {
	public long reverse(long a) {
	    if(a==0){
	        return 0;
	    }
	    long ans = 0;
	    for(int i=0;i<32;i++){
	        ans = ans<<1;
	        ans = ans + (a & 1);
	        a = a>>1;
	    }
	    return ans;
	}
}
