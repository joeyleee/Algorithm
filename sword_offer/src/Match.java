/*
请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。
在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配
 */
public class Match {
    public boolean match(char[] str, char[] pattern)
    {
        if(str==null||pattern==null)return  false;
      return helper(str,pattern,0,0);

    }
    public boolean helper(char[] str,char[] pattern,int strLen,int patLen){
        if(strLen<str.length&&patLen==pattern.length)return false;
        if(strLen==str.length&&patLen==pattern.length)return true;
        if(patLen<pattern.length-1&&pattern[patLen+1]=='*'){
            if(strLen<str.length&&(str[strLen]==pattern[patLen]||pattern[patLen]=='.')){
                return helper(str,pattern,strLen+1,patLen)||
                        helper(str,pattern,strLen+1,patLen+2)||
                        helper(str,pattern,strLen,patLen+2);
            }
            else return helper(str,pattern,strLen,patLen+2);
        }else{
            if(strLen<str.length&&(str[strLen]==pattern[patLen]||pattern[patLen]=='.'))return helper(str,pattern,strLen+1,patLen+1);

        }
        return false;
    }
}
