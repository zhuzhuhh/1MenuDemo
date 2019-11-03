package sort.test1;

import java.util.Scanner;

public class IfDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int iScore= input.nextInt();
        String sGrade;
        if (iScore>=90)
           sGrade="优秀";
           else if (iScore>=80)
               sGrade="良好";
           else if (iScore>=70)
               sGrade="中";
           else if (iScore>=60)
               sGrade="及格";
           else
               sGrade="不及格";
        System.out.println("学生的成绩是："+iScore);
        System.out.println("学生的成绩是："+sGrade);
    }
}
