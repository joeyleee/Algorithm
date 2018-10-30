package binary_tree;

import java.util.LinkedList;
import java.util.List;

/*
请把纸条竖着放在桌⼦上，然后从纸条的下边向上⽅对折，压出折痕后再展 开。此时有1条折痕，突起的⽅向指向纸条的背⾯，这条折痕叫做“下”折痕 ；突起的⽅向指向纸条正⾯的折痕叫做“上”折痕。如果每次都从下边向上⽅ 对折，对折N次。请从上到下计算出所有折痕的⽅向。

给定折的次数n,请返回从上到下的折痕的数组，若为下折痕则对应元素为"down",若为上折痕则为"up".

测试样例：
1
返回：["down"]
 */
public class FoldPaper {
    public String[] foldPaper(int n) {
        // write code here
        List<String> res =new LinkedList<>();
        traversal(res,1,n,false);
        String[] result = new String[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]=res.get(i);
        }
        return result;
    }
    public void traversal (List res,int deep,int n,boolean flag){
        if(deep>n){
            return ;
        }
        traversal(res,deep+1,n,false);
        res.add(flag?"up":"down");
        traversal(res,deep+1,n,true);
    }
}
