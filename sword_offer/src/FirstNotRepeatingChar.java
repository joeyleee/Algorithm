/*
在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */
public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
        int[] counts=new int[256];
        for(int i=0;i<str.length();i++){
            counts[(int)str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(counts[(int)str.charAt(i)]==1){
                return i;
            }
        }
        return -1;
    }
}
