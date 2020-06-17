package day2;

public class Work2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4 ; i++) {

            //每行空格的个数
            for (int j = 1; j <= 4 - i; j++) {//空格数=行数-行号
                System.out.print(" ");
            }

            //每行*的个数
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
