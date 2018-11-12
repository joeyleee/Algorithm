/*
输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，并保证奇数和奇数，偶数和偶数之间的相对位置不变
 */
public class reOrderArray {
    public void reOrderArray(int [] array) {
        if(array==null||array.length==0){
            return;
        }
        int[] temp=new int[array.length];
        int index=0;
        for(int i=0;i<array.length;i++){
            if((array[i]&1)!=0){
                temp[index]=array[i];
                index++;
            }
        }
        for(int i=0;i<temp.length;i++){
            if((array[i]&1)==0){
                temp[index]=array[i];
                index++;
            }
        }
        for(int i=0;i<temp.length;i++){
            array[i]=temp[i];
        }
        return;
    }
}
