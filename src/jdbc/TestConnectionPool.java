package jdbc;

import java.util.ArrayList;
import java.util.List;

public class TestConnectionPool {

	private static int threadNumber = 100;
	public static int insertTime = 1;

	public static void main(String[] args) {
		traditionalWay();
		connectionPoolWay();
	}

	private static void connectionPoolWay() {
		ConnectionPool cp = new ConnectionPool(10);

		System.out.println("开始连接池方式插入数据测试：");
		long start = System.currentTimeMillis();
		List<Thread> ts = new ArrayList<>();
		for (int i = 0; i < threadNumber; i++) {
			Thread t = new ConnectionpoolWorkingThread(cp);
			t.start();
			ts.add(t);
		}
		// 等待所有线程结束
		for (Thread t : ts) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();

		System.out.printf("使用连接池方式，启动%d条线程，每个线程插入%d条数据，一共耗时%d 毫秒%n", threadNumber, insertTime, end - start);

	}

	private static void traditionalWay() {
		System.out.println("开始传统方式插入数据测试：");
		long start = System.currentTimeMillis();
		List<Thread> ts = new ArrayList<>();
		for (int i = 0; i < threadNumber; i++) {
			Thread t = new TraditionalWorkingThread();
			t.start();
			ts.add(t);
		}
		// 等待所有线程结束
		for (Thread t : ts) {
			try {
				t.join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();

		System.out.printf("使用传统方式，启动%d条线程，每个线程插入%d条数据，一共耗时%d 毫秒%n", threadNumber, insertTime, end - start);

	}
}

/*
 * package jdbc;
 * 
 * import java.sql.Connection; import java.sql.SQLException; import
 * java.sql.Statement;
 * 
 * import jdbc.ConnectionPool;
 * 
 * public class TestConnectionPool {
 * 
 * public static void main(String[] args) { ConnectionPool cp = new
 * ConnectionPool(3); for (int i = 0; i < 100; i++) { new WorkingThread(
 * "working thread" + i, cp).start(); }
 * 
 * } }
 * 
 * class WorkingThread extends Thread { private ConnectionPool cp;
 * 
 * public WorkingThread(String name, ConnectionPool cp) { super(name); this.cp =
 * cp; }
 * 
 * public void run() { Connection c = cp.getConnection();
 * System.out.println(this.getName()+ ":\t 获取了一根连接，并开始工作" ); try (Statement st =
 * c.createStatement()){
 * 
 * //模拟时耗１秒的数据库ＳＱＬ语句 Thread.sleep(1000); st.execute("select * from hero");
 * 
 * } catch (SQLException | InterruptedException e) { // TODO Auto-generated
 * catch block e.printStackTrace(); } cp.returnConnection(c); } }
 */