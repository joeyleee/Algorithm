package string;
/*
对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后。

给定一个字符串A和它的长度，同时给定len，请返回平移后的字符串。

测试样例：
"ABCDE",5,3
返回："DEABC"
 */

public class Translation {
    public String stringTranslation(String A, int n, int len) {
        // write code here
        char[] s = A.toCharArray();
        reverse(s, 0, len - 1);
        reverse(s, len, n - 1);
        reverse(s, 0, n - 1);
        return String.valueOf(s);

    }

    public static void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }

    }
}
