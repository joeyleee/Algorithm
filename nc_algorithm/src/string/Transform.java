package string;

import java.util.HashMap;
import java.util.Map;

/*
对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。

给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。

测试样例：
"abc",3,"bca",3
返回：true
 */
public class Transform {
    public boolean chkTransform(String A, int lena, String B, int lenb) {
        // write code here
        if(A.length()!=B.length())return false;
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();
        HashMap<Character,Integer> hash = new HashMap<Character, Integer>();
        for(int i =0;i<lena;i++){
            hash.put(a[i],hash.getOrDefault(a[i],0)+1);
            hash.put(b[i],hash.getOrDefault(b[i],0)-1);
        }
        for(Map.Entry<Character,Integer> entry :hash.entrySet()){
            if(entry.getValue()!=0)return false;

        }
        return true;

    }

}
