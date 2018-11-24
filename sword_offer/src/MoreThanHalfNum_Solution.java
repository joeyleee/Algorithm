import java.util.Random;

/*
数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。
 */
public class MoreThanHalfNum_Solution {
    public int MoreThanHalfNum_Solution(int [] array) {
        int len=array.length;
        int start=0;
        int end=len-1;
        int mid=(start+end)/2;
        int index=partition(array,start,end);
        while(index!=mid){
            if(index<mid){
                start=index+1;
                index=partition(array,start,end);
            }
            else{
                end=index-1;
                index=partition(array,start,end);
            }
        }
        int times=0;
        for(int i=0;i<len;i++){
            if(array[i]==array[index])times++;
            System.out.println(array[i]);
        }
        if(times*2<=len)return 0;
        return array[mid];
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
    public static void main(String[] argus){
        int[] test={1,3,4,5,2,2,2,2,2};
        System.out.println(new MoreThanHalfNum_Solution().MoreThanHalfNum_Solution(test));
    }
}
