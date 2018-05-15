package string;

public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        int num = 0;
        for(int i = 0 ;i < n ;i++){
            if(num<0)return false;
            if(A.charAt(i)=='(') num++;
            if(A.charAt(i)==')') num--;
            if(A.charAt(i)!=')'&&A.charAt(i)!='(')return false;

        }
        if(num!=0)return false;
        return true;
    }
}
