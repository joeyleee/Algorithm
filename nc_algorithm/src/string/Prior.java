package string;

import java.util.Arrays;
import java.util.Comparator;

/*
对于一个给定的字符串数组，请找到一种拼接顺序，使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。

给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。

测试样例：
["abc","de"],2
"abcde"
 */
public class Prior {
    public class MyComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {
            return (a + b).compareTo(b + a);
        }
    }
    public String findSmallest(String[] strs, int n) {
        // write code here
        Arrays.sort(strs,new MyComparator());
        StringBuffer sb = new StringBuffer();
        for(int i =0;i<n;i++){
            sb.append(strs[i]);
        }
    return sb.toString();
    }


}
