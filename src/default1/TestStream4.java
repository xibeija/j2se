package default1;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TestStream4 {

	public static void main(String[] args) {
        File f = new File("E:\\project\\j2se\\src\\Test.txt");
        try (FileInputStream fis = new FileInputStream(f);) {
            byte[] all = new byte[(int) f.length()];
            fis.read(all);
   
            //文件中读出来的数据是
            System.out.println("文件中读出来的数据是：");
            for (byte b : all)
            {
                int i = b&0x000000ff;  //只取16进制的后两位
                System.out.println(Integer.toHexString(i));
            }
            System.out.println("把这个数字，放在GBK的棋盘上去：");
            String str = new String(all,"UTF-8");
            System.out.println(str);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   
    }
	
}
