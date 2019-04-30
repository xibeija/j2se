package default1;

public class TestException {

	public static int method() {
        try {
            return return1();
        } catch (Exception e) {
            return return2();
        } finally {
            return return3();
        }
    }
 
    private static int return1() {
        System.out.println("return 1");
        return 1;
    }
    private static int return2() {
        System.out.println("return 2");
        return 2;
    }
    private static int return3() {
        System.out.println("return 3");
        return 3;
    }
 
    public static void main(String[] args) {
        int result = method();
        System.out.println("result:" + result);
         
    }
	
	/*public static void main(String[] args) {
        
        File f= new File("d:/LOL.exe");
          
        //试图打开文件LOL.exe，会抛出FileNotFoundException，如果不处理该异常，就会有编译错误
//        new FileInputStream(f);
          
    }*/
	
}
