import java.util.Comparator;
import java.util.PriorityQueue;

/*
如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。
 */
public class Median {
    int totalNum=0;
    PriorityQueue<Integer> max=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });
    PriorityQueue<Integer> min=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2);
        }
    });
    public void Insert(Integer num) {
        totalNum++;
        if((totalNum&1)==0){
            if(max.size()!=0&&num<max.peek()){
                max.offer(num);
                min.offer(max.poll());
            }
            else{
                min.offer(num);
            }
        }
        else{
            if(min.size()!=0&&num>min.peek()){
                min.offer(num);
                max.offer(min.poll());
            }
            else{
                max.offer(num);
            }
        }
    }
    public Double GetMedian() {
        Double res=0.0;
        if((totalNum&1)==0){
            res=(double)(min.peek()+max.peek())/2;
        }else{
            res=(double)max.peek();
        }
        return  res;
    }
}
