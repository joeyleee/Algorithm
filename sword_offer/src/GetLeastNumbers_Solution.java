import java.util.ArrayList;
import java.util.Random;

/*
输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class GetLeastNumbers_Solution {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        if(k>input.length||input==null||input.length==0||k==0){
            return new ArrayList<>();
        }
        int start =0;
        int end=input.length-1;
        int index=partition(input,start,end);
        while(index!=k-1){
            if(index<k-1){
                start=index+1;
                index=partition(input,start,end);
            }else{
                end=index-1;
                index=partition(input,start,end);
            }
        }
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;

    }
    public int partition(int[] array,int start,int end){
        Random random=new Random();
        int small=start-1;
        for(int i=start;i<end;i++){
            if(array[i]<array[end]){
                small++;
                if(small!=i){
                    swap(array,small,i);
                }
            }
        }
        small++;
        swap(array,small,end);
        return small;
    }
    public void swap(int[] array,int i,int j){
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
