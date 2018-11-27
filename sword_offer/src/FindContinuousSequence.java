import java.util.ArrayList;

/*
小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 */
public class FindContinuousSequence {
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        int left=0;
        int right=1;
        int cur=0;
        while(right<=sum){
            if(cur<sum){
                cur+=right;
                right++;
            }
            else if(cur>sum){
                left++;
                cur-=left;
            }
            else{
                ArrayList<Integer> temp =new ArrayList<>();
                int i=left+1;
                while(i<right){
                    temp.add(i);
                    i++;
                }
                res.add(temp);
                cur+=right;
                right++;
            }
        }
        return res;
    }
}
