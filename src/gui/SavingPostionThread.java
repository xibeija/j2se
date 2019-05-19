package gui;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JFrame;

class SavingPostionThread extends Thread {
	 
    private JFrame f;
    File file = new File("e:/project/j2se/location.txt");
 
    SavingPostionThread(JFrame f) {
        this.f = f;
    }
 
    public void run() {
        while (true) {
            int x = f.getX();
            int y = f.getY();
 
            try (FileOutputStream fos = new FileOutputStream(file);
                    DataOutputStream dos = new DataOutputStream(fos);) {
                dos.writeInt(x);
                dos.writeInt(y);
            } catch (Exception e) {
                e.printStackTrace();
            }
 
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
 
        }
    }
}
