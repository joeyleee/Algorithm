public class Power {
    public double Power(double base, int exponent) {
        if(exponent==0)return 1;
        int absExponent=exponent<0?-exponent:exponent;
        double result=getPower(base,absExponent);
        if(exponent<0){
            result=1/result;
        }
        return result;
    }
    public double getPower(double base,int exponent){
        if(exponent==0){
            return 1;
        }
        if(exponent==1){
            return base;
        }
        double result =getPower(base,exponent>>1);
        result*=result;
        if(exponent/2==1){
            result=base*result;
        }
        return result;
    }
}
