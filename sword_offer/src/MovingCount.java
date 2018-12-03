/*
地上有一个m行和n列的方格。一个机器人从坐标0,0的格子开始移动，每一次只能向左，右，上，下四个方向移动一格，但是不能进入行坐标和列坐标的数位之和大于k的格子。
例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class MovingCount {
    int res=0;
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean[][] visited=new boolean[rows][cols];
        helper(threshold,rows,cols,0,0,visited);
        return res;
    }
    public void helper(int k,int rows,int cols,int i,int j,boolean[][] visited ){
        if(i>=0&&j>=0&&i<rows&&j<cols&&!visited[i][j]&&isRight(i,j,k)){
            res++;
            visited[i][j]=true;
            helper(k,rows,cols,i+1,j,visited);
            helper(k,rows,cols,i-1,j,visited);
            helper(k,rows,cols,i,j+1,visited);
            helper(k,rows,cols,i,j-1,visited);
            //visited[i][j]=false;
        }
        return;
    }
    public boolean isRight(int i,int j,int k){
        int num=0;
        while(i>0){
            num+=i%10;
            i=i/10;
        }
        while(j>0){
            num+=j%10;
            j=j/10;
        }
        return num>k?false:true;
    }
    public static void main(String[] args){
        int i=new MovingCount().movingCount(5,5,5);
        System.out.println(i);
    }
}
