import java.util.Arrays;
public class Print1ToNDigits {
    public static void main(String[] args) {
        Print1ToNDigits test = new Print1ToNDigits();
        test.printToMax(3);
    }
    public void printNumber(char[] num){
        int size = num.length;
        int i = 0;
        while(i < size && num[i] == '0')
            i++;
        if(i == size)
            return;
        char[] printNum = Arrays.copyOfRange(num, i, size);
        System.out.println(printNum);
    }
    public void printToMax(int n){
        if(n <= 0) return;
        char[] number = new char[n];
        Arrays.fill(number, '0');
        printOrder(number,n,0);
    }
    public void printOrder(char[] number, int n, int loc){
        if(loc == n) return;
        for(int i = 0; i <= 9; i++){
            number[loc] = (char)('0' + i);
            if(loc == n - 1){
                printNumber(number);
            }
            printOrder(number,n,loc + 1);
        }
    }
}
