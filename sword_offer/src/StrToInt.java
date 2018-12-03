/*
将一个字符串转换成一个整数(实现Integer.valueOf(string)的功能，但是string不符合数字要求时返回0)，要求不能使用字符串转换整数的库函数。
 数值为0或者字符串不是一个合法的数值则返回0。
 */
public class StrToInt {
    public int StrToInt(String str) {
        if(str.length()==0||str==null)return  0;
        char[] num=str.toCharArray();
        int res=0;
        int flag=1;
        if(num[0]=='-'||num[0]=='+'){
            flag=num[0]=='-'?-1:1;
            for(int i=1;i<num.length;i++){
                if(num[i]<'0'||num[i]>'9'){
                    return 0;
                }
                res*=10;
                res+=num[i]-'0';
            }
        }else {
            for (int i = 0; i < num.length; i++) {
                if (num[i] < '0' || num[i] > '9') {
                    return 0;
                }
                res *= 10;
                res += num[i] - '0';
            }
        }
        return res*flag;
    }
}
