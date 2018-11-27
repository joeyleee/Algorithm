import java.util.ArrayList;

/*
输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 */
public class FindNumbersWithSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res=new ArrayList<>();
        if(array==null||array.length<2)return res;
        int left=0;
        int right=array.length-1;
        while(left<right&&array[left]+array[right]!=sum){
            if(array[left]+array[right]<sum){
                left++;
            }
            else{
                right--;
            }
        }
        if(array[left]+array[right]!=sum)return  res;
        res.add(array[left]);
        res.add(array[right]);
        return res;
    }
}
