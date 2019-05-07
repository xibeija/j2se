package default1;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestStream9 {

	static File f =new File("d:/data.txt");
    static int x = 31;
    static int y = 15;
    public static void main(String[] args) {
         
        //缓存流方式
        method1();
        //数据流方式
        method2();
    }
  
    private static void method2() {
        try (
                FileInputStream fis  = new FileInputStream(f);
                DataInputStream dis =new DataInputStream(fis);
                FileOutputStream fos  = new FileOutputStream(f);
                DataOutputStream dos =new DataOutputStream(fos);
                 
        ){
            dos.writeInt(x);
            dos.writeInt(y);
             
            int x = dis.readInt();
            int y = dis.readInt();
            System.out.printf("使用数据流读取出的x是 %d y是 %d%n",x,y);
             
        } catch (IOException e) {
            e.printStackTrace();
        }
         
    }
 
    private static void method1() {
         try (
                 FileWriter fw = new FileWriter(f);
                 PrintWriter pw = new PrintWriter(fw);
                 FileReader fr = new FileReader(f);
                 BufferedReader br = new BufferedReader(fr);                
                  
         ) {
             pw.print(x+"@"+y);
             pw.flush();
             String str = br.readLine();
             String[] ss =str.split("@");
             int x = Integer.parseInt(ss[0]);
             int y = Integer.parseInt(ss[1]);
             System.out.printf("使用缓存流读取出的x是 %d y是 %d%n",x,y);
              
         } catch (IOException e) {
             // TODO Auto-generated catch block
             e.printStackTrace();
         }
    
    }
 
    private static void read() {
        File f =new File("d:/data.txt");
        try (
                FileInputStream fis  = new FileInputStream(f);
                DataInputStream dis =new DataInputStream(fis);
        ){
            boolean b= dis.readBoolean();
            int i = dis.readInt();
            String str = dis.readUTF();
              
            System.out.println("读取到布尔值:"+b);
            System.out.println("读取到整数:"+i);
            System.out.println("读取到字符串:"+str);
  
        } catch (IOException e) {
            e.printStackTrace();
        }
          
    }
  
    private static void write() {
        File f =new File("d:/data.txt");
        try (
                FileOutputStream fos  = new FileOutputStream(f);
                DataOutputStream dos =new DataOutputStream(fos);
        ){
            dos.writeBoolean(true);
            dos.writeInt(300);
            dos.writeUTF("123 this is gareen");
        } catch (IOException e) {
            e.printStackTrace();
        }
          
    }
	
}
