package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class TestLog4j {
	static Logger logger = Logger.getLogger(TestLog4j.class);
	public static void main(String[] args) throws InterruptedException {
		PropertyConfigurator.configure("e:\\project\\j2se\\src\\log4j.xml");
        for (int i = 0; i < 5000; i++) {
            logger.trace("������Ϣ");
            logger.debug("������Ϣ");
            logger.info("�����Ϣ");
            logger.warn("������Ϣ");
            logger.error("������Ϣ");
            logger.fatal("������Ϣ");
        }
		
		
		/*PropertyConfigurator.configure("e:\\project\\j2se\\src\\log4j.properties");
        for (int i = 0; i < 5000; i++) {
            logger.trace("������Ϣ");
            logger.debug("������Ϣ");
            logger.info("�����Ϣ");
            logger.warn("������Ϣ");
            logger.error("������Ϣ");
            logger.fatal("������Ϣ");
        }*/
		
		
		/*BasicConfigurator.configure();
		logger.setLevel(Level.DEBUG);
		logger.trace("������Ϣ");
        logger.debug("������Ϣ");
        logger.info("�����Ϣ");
        Thread.sleep(1000);
        logger.warn("������Ϣ");
        logger.error("������Ϣ");
        logger.fatal("������Ϣ");*/
		
		
        /*System.out.println("������Ϣ");
        System.out.println("������Ϣ");
        System.out.println("�����Ϣ");
        System.out.println("������Ϣ");
        System.out.println("������Ϣ");
        System.out.println("������Ϣ");*/
 
    }
}
