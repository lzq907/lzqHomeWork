package test1;

import java.io.*;

public class Work4 {
    public static void main(String[] args) {
        DataInputStream dis = null;
        DataOutputStream dos = null;
        try {
            dis= new DataInputStream(new FileInputStream("D:\\lzqworkspace\\555.txt"));//复制文件路径
            File f =new File("D:\\lzqworkspace\\src\\666.txt")   ;          //文件保存路径
            String pic = "laohu.jpg";//文件名称
            if(!f.exists()){  		//判断路径是否存在
                f.mkdirs();
            }
            dos = new DataOutputStream(   new FileOutputStream(f)        );//使用字节流需要new一个数据流
            byte[] b  = new byte[1024*5];//字节流一次读多少
            int len = 0;
            while ((len = dis.read(b))!= -1) {	//是否还有数据
                dos.write(b,0,len);
            }
            dos.flush();
            System.out.println("文件复制成功！");
        } catch (FileNotFoundException e) {
            System.out.println("要操作的文件未发现！");
        } catch (IOException e) {
            System.out.println("文件读写失败！");
        }finally{
            try {
                if(dis!=null){
                    dis.close();
                }
                if(dos!= null){
                    dos.close();
                }
            } catch (IOException e) {
                System.out.println("数据流关闭异常！");
            }
        }
        System.out.println("复制成功！");
    }

}


