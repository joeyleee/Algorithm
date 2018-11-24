/*
输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class VerifySquenceOfBST {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if(sequence.length==0)return  false;
        return helper(sequence,0,sequence.length-1);
    }
    public boolean helper(int[] seq,int start,int end){
        if(end<=start)return  true;
        int index=end-1;
        while(index>=start&&seq[index]>seq[end]){
            index--;
        }

        for(int i=index;i>=start;i--){
            if(seq[i]>seq[end])return  false;
        }
        return helper(seq,start,index)&&helper(seq,index+1,end-1);
    }
    public static void main(String args[]){
        int[] arg={7,4,6,5};
        VerifySquenceOfBST test= new VerifySquenceOfBST();
        test.VerifySquenceOfBST(arg);
    }
}
