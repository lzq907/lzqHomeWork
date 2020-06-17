package day2;

public class Work3 {
    public static void main(String[] args) {
        int j;
        int sum=0;
        for (int i = 2; i <= 100; i++) // 1不是素数，所以直接从2开始循环bai
        {
            j = 2;
            while (i % j != 0)
                j++; // 测试du2至i的数字是否能被i整除，如不能就自加zhi
            if (j == i) {// 当有被整除的数字时，判断它是不是自身
                System.out.print(i+"\t");
            sum=sum+i;}
        }
        System.out.println();
        System.out.println("100以内的素数之和sum="+sum);
    }
}
