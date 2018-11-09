public class NumberOf1 {
//    public int NumberOf1(int n) {
//        int res=0;
//        int flag=1;
//        while(flag!=0){
//            if ((n&flag)!=0){
//                res++;
//            }
//            flag=flag<<1;
//        }
//        return res;
//    }
    public int NumberOf1(int n) {
        int res=0;
        while(n!=0){
            n=n&(n-1);
            res++;
        }
        return res;
    }
}
