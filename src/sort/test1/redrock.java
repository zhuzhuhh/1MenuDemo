import java.util.Scanner;

public class redrock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请你输入第一个矩阵的规模:");
        int line = input.nextInt();
        int list = input.nextInt();
        int[][] num = new int[line][list];
        System.out.println("请输入第一个矩阵的值：");
        for (int a = 0; a < line; a++) {
            for (int b = 0; b < list; b++)
                num[a][b] = input.nextInt();
        }
        System.out.println("请你输入第二个矩阵的规模:");
        int line1 = input.nextInt();
        int list1 = input.nextInt();
        int[][] num1 = new int[line1][list1];
        System.out.println("请输入第二个矩阵的值：");
        for (int a = 0; a < line1; a++) {
            for (int b = 0; b < list1; b++)
                num1[a][b] = input.nextInt();
        }
        int list2 = 0, line2 = 0;
        int[][] num2 = new int[line][list1];
        for (list2 = 0; list2 < line; list2++)
            for (line2 = 0; line2 < list1; line2++) {
                for (int w = 0; w < list; w++)
                    num2[list2][line2] = num2[list2][line2] + num[list2][w] * num1[w][line2];
            }
        System.out.println("相乘结果为:");
        for (int y = 0; y < list1; y++) {
            for (int x = 0; x < line; x++)
                System.out.print(num2[y][x] + " ");
            System.out.println();
        }
    }
}
