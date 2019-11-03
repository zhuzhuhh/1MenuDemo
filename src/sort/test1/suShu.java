package sort.test1.suShu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;

public class suShu {
    public static void main(String[] args) {
        System.out.println("3--100de素数有：");
        boolean isprime;
        int iCount = 0;
        for (int i = 3; i <= 100; i++) ;
        {
            isprime = true;
            int i = 0;
            for (int j = 2; j <= i / 2; j++) {
                if(i%j==0)
                {
                    boolean flase = false;
                    isprime = flase;
                    break;
                }
            }
            if(isprime)
            {
                System.out.println(i+"\t");
                iCount++;
                if (iCount % 6 == 0) System.out.println();
            }
        }
    }
}
