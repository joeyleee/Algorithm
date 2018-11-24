import java.util.ArrayList;
import java.util.Arrays;

/*
输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 */
public class Permutation {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> res =new ArrayList<>();
        if(str==null||str.length()==0){
            return res;
        }
        char[] strs=str.toCharArray();
        boolean[] used =new boolean[strs.length];
        StringBuffer sb=new StringBuffer();
        Arrays.sort(strs);
        helper(res,strs,sb,used);
        return res;
    }
    public void helper(ArrayList<String> res,char[] str,StringBuffer sb,boolean[] used){
        if(sb.length()==str.length){
            res.add(new String(sb));
            return;
        }
        for(int i=0;i<str.length;i++){
            if(used[i])continue;
            if(i!=0&&str[i]==str[i-1]&&!used[i-1]){
                continue;
            }
            used[i]=true;
            sb.append(str[i]);
            helper(res,str,sb,used);
            sb.deleteCharAt(sb.length()-1);
            used[i]=false;
        }
        return;
    }
}
