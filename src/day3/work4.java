package day3;

public class work4 {
    public static void main(String[] args) {
        char [] input={'2','1','5','3','6','8','7','9'};
        int [] result=generate(input);
        System.out.println("偶数的个数为"+result[0]+",奇数的个数为"+result[1]);
        combine(input,result);
    }



    private static int[] generate(char[] input) {
        int [] result= new int[2];
        for (int i=0;i<8;i++){
            if (input[i]%2==0)
            {
                result[0]++;//奇数个数
            }
            else {
                result[1]++;//偶数个数
            }
        }
        return result;
    }

    private static void combine(char[] input, int[] result) {
        int k = 0,s = 0;
        char[] shuzu = new char[10];
        char[] jishuzu = new char[8];
        char[] oushuzu = new char[8];


        for (int i = 0; i < 8; i++) {
            if (input[i] % 2 == 0) {
                oushuzu[k] = input[i];
                k++;
            } else {
                jishuzu[s] = input[i];
                s++;
            }
        }



        if (result[1] >= result[0]) {
            int i = 0;
            for (int j = 0; j < result[0]; j++) {
                shuzu[i] = jishuzu[j];
                i++;
                shuzu[i] = oushuzu[j];
                i++;
            }

            for (int j = result[0] ; j < result[1]; j++) {
                shuzu[i] = jishuzu[j];
                i++;
            }
        }else
            {
                int n = 0;
                for (int j = 0; j < result[1]; j++) {
                    shuzu[n] = jishuzu[j];
                    n++;
                    shuzu[n] = oushuzu[j];
                    n++;
                }
               for (int j = result[1]; j < result[0]; j++) {
                    shuzu[n] = oushuzu[j];
                    n++;
                }
            }
        for(int t=0;t<8;t++)
            System.out.print(shuzu[t]+" ");
    }
}
