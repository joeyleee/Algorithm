/*
在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。
也不知道每个数字重复几次。请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class Duplicate {
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null||numbers.length<=1)return false;
        int i=0;
        while(i<numbers.length){

                int num = numbers[i];
            System.out.println("i:"+i+"num:"+num);
                if(numbers[i]==i) {
                    i++;
                }
                else if(numbers[num]!=num) {
                int temp=numbers[num];
                numbers[num] = num;
                numbers[i]=temp;
            }
            else{
                duplication[0]=num;
                return true;
            }
        }
        duplication[0]=-1;
        return  false;
    }
    public static void main(String args[]){
        int[] test={2,1,3,0,4};
        int[] res=new int[1];
        new Duplicate().duplicate(test,5,res);
        System.out.println(res[0]);

    }
}
