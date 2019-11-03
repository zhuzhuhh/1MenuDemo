package sort.test1;

public class Sum100 {
    public static void main(String[] args) {
        int iloop=1;
        int iSum=0;
        while (iloop<=5)
        {
            iSum+=iloop;
            iloop++;
        }
        System.out.println("1到100的累加和是："+iSum);
    }
}
