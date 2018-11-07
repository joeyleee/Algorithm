/*
把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class minNumberInRotateArray {
    public int minNumberInRotateArray(int [] array) {
        if(array==null||array.length==0)return  0;
        int start=0;
        int end=array.length-1;
        int mid=0;
        if(array[start]<array[end])return array[0];
        while(array[start]>=array[end]){
            mid=(start+end)/2;
            if(end-start==1){
                mid=end;
                break;
            }
            if(array[start]==array[end]&&array[start]==array[mid])return  helper(array);
            if(array[mid]<=array[end]){
                end=mid;
            }
            if(array[mid]>=array[start]){
                start=end;
            }
        }
        return array[mid];
    }
    public int helper(int[] array){
        int temp=Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]<temp){
                temp=array[i];
            }
        }
        return temp;
    }
}
