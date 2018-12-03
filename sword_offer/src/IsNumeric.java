/*
请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */
public class IsNumeric {
    public  int index=0;
    public boolean isNumeric(char[] str) {
        boolean res=checkSign(str);
        if(index<str.length&&str[index]=='.'){
            index++;
            res=checkInt(str)||res;
        }
        if(index<str.length&&(str[index]=='e'||str[index]=='E')){
            index++;
            res=res&&checkSign(str);
        }
        return index==str.length?res:false;
    }

    public  boolean checkInt(char[] str){
        int start=index;
        while(index<str.length&&str[index]>='0'&&str[index]<='9'){
            index++;
        }
        return index>start?true:false;
    }
    public  boolean checkSign(char[] str){
        if(index<str.length&&(str[index]=='+'||str[index]=='-')){
            index++;
        }
        return checkInt(str);
    }
    public static void main(String args[]){
        String test="123.45e+6";
        char[] chars=test.toCharArray();
        System.out.println(new IsNumeric().isNumeric(chars));

    }
}
