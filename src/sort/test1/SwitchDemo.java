package sort.test1;

import java.io.InputStream;
import java.util.Scanner;

public class SwitchDemo {

    public SwitchDemo(InputStream in) {

    }

    public void showDays(int iMoth)
   {
       int iDays=0;
       switch (iMoth)
       {
           case 2:iDays=28;break;
           case 4:iDays=30;break;
           case 6:iDays=30;break;
           case 9:iDays=30;break;
           case 11:iDays=30;break;
           default: iDays=31;
       }
       System.out.println(iMoth+"月有"+iDays+"天！");
   }

    public static void main(String[] args) {
        {
            Scanner intput =new Scanner(System.in);
            System.out.println("第几月：");
            int a=intput.nextInt();
            SwitchDemo obj=new SwitchDemo(System.in);
            System.out.println("第几月：");
            obj.showDays(4);

        }
    }
}

