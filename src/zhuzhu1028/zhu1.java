package zhuzhu1028;

import java.util.Scanner;

public class zhu1 {
    public static void main(String[] args) {
        double width,height,area,girth;
        Scanner keyIN=new Scanner(System.in);
        System.out.println("请输入：");
        width =keyIN.nextDouble();
        System.out.println("请输入");
        height =keyIN.nextDouble();
        area=width*width;
        girth=2*(width+height);
        System.out.println("面积"+area+"\n周次"+girth);
    }
}
