import java.util.ArrayList;

/*
输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */
public class printMatrix {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix==null||matrix.length==0){
            return new ArrayList<Integer>();
        }
        ArrayList<Integer> res=new ArrayList<>();
        int x=matrix.length;
        int y=matrix[0].length;
        int left=0,right=y-1,top=0,bottom=x-1;
        while(true){
           for(int i=left;i<=right;i++){
               res.add(matrix[top][i]);
           }
           top++;
           if(left>right||top>bottom)break;
           for(int i=top;i<=bottom;i++){
                res.add(matrix[i][right]);
            }
            right--;
            if(left>right||top>bottom)break;
            for (int i=right;i>=left;i--){
                    res.add(matrix[bottom][i]);
            }
            bottom--;
            if(left>right||top>bottom)break;
            for (int i=bottom;i>=top;i--){
                res.add(matrix[i][left]);
            }
            left++;
            if(left>right||top>bottom)break;
        }
      return  res;
    }
}
