import java.util.ArrayList;

public class GenerateAllParanthesisII {
	public String[] generateParenthesis(int A) {
        ArrayList<String> result = new ArrayList<String>();
        paranthesis(result, new StringBuilder(), A, 0, 0);
        String[] ans = result.toArray(new String[result.size()]);
        return ans;
    }
    private void paranthesis(ArrayList<String> result, StringBuilder sb, int A, int open, int close){
        if(open==A && close==A){
            result.add(sb.toString());
            return;
        }
        if(open<A){
            sb.append("(");
            paranthesis(result, sb, A, open+1, close);
            sb.setLength(sb.length()-1);
        }
        if(close<open){
            sb.append(")");
            paranthesis(result, sb, A, open, close+1);
            sb.setLength(sb.length()-1);
        }
    }
}
