import java.util.*;

/*
请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"
 */
public class FirstAppearingOnce {
    //Insert one char from stringstream
    LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
    public void Insert(char ch)
    {
        map.put(ch,map.getOrDefault(ch,0)+1);
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return '#';
    }
}
