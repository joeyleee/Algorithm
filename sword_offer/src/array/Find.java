package array;
/*
在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        if(array==null||array.length==0||array[0].length==0){
            return  false;
        }
        int x=0;
        int y=array[0].length-1;
        while(y>=0&&x<=array.length-1){
            if(array[x][y]<target){
                x++;
            }
            else if(array[x][y]>target){
                y--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
