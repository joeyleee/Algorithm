package string;
/*
对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。

给定一个原字符串A和他的长度，请返回逆序后的字符串。

测试样例：
"dog loves pig",13
返回："pig loves dog"
 */

public class Reverse {
    public static String reverseSentence(String A, int n) {
        // write code here
        char[] s = A.toCharArray();
        reverse(s,0,n-1);
        int l=0,r=-1;
        for(int i=0;i<n;i++){
            if(s[i]!=' '){
                r=i;
            }
            else{
                reverse(s,l,r);
                l=i+1;
            }

        }
        reverse(s,l,r);
        return String.valueOf(s);
    }
    public static void reverse(char[] s,int start,int end){
       while(start<end){
            char temp = s[end];
            s[end] = s[start];
            s[start] = temp;
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        Reverse.reverseSentence("TUM MKIALI KVJUBEN VBSEWFT JAD AIZWEL CP LG PTB",47);

    }

}
