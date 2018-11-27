/*
牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。例如，“student. a am I”。
后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */
public class ReverseSentence {
    public String ReverseSentence(String str) {
        if(str.length()==0||str==null)return str;
        if(str.trim().equals("")){
            return str;
        }
        StringBuffer sb =new StringBuffer(str);
        sb.reverse();
        int start=0;
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)==' '){
                reverseIn(sb,start,i-1);
                while(sb.charAt(i)==' '){
                    i++;
                }
                start=i;
            }
        }
        reverseIn(sb,start,sb.length()-1);
        return sb.toString();
    }
    public void reverseIn(StringBuffer sb,int start,int end){
        while(start<end){
            char temp=sb.charAt(start);
            sb.setCharAt(start,sb.charAt(end));
            sb.setCharAt(end,temp);
            start++;
            end--;
        }
    }
}
