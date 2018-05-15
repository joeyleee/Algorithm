package string;
/*
请编写一个方法，将字符串中的空格全部替换为“%20”。假定该字符串有足够的空间存放新增的字符，并且知道字符串的真实长度(小于等于1000)，同时保证字符串由大小写的英文字母组成。

给定一个string iniString 为原始的串，以及串的长度 int len, 返回替换后的string。

测试样例：
"Mr John Smith”,13
返回："Mr%20John%20Smith"
”Hello  World”,12
返回：”Hello%20%20World”
Java(javac 1.8)重置
 */
public class Replacement {
    public String replaceSpace(String iniString, int length) {
        // write code here
        int num = 0;
        for(int i = 0;i<length;i++){
            if(iniString.charAt(i)==' '){
                num++;
            }
        }
        if(num==0)return iniString;
        int totalLen=length+2*num-1;
        char[] str = new char[totalLen+1];
        for(int i = length-1;i>=0;i--){
            if(iniString.charAt(i)==' '){
                str[totalLen--]='0';
                str[totalLen--]='2';
                str[totalLen--]='%';
            }else {
                str[totalLen--] = iniString.charAt(i);
            }
        }
        return String.valueOf(str);
    }
}
