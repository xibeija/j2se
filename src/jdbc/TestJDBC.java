package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//public class TestJDBC {
//    
//    public static void list(int start, int count){
//         try {
//                Class.forName("com.mysql.jdbc.Driver");
//            } catch (ClassNotFoundException e) {
//                e.printStackTrace();
//            }
//      
//            try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java2?characterEncoding=UTF-8",
//                    "root", "admin"); Statement s = c.createStatement();) {
//      
//                String sql = "select * from hero limit " +start + "," + count;
// 
//                // 执行查询语句，并把结果集返回给ResultSet
//                ResultSet rs = s.executeQuery(sql);
//                while (rs.next()) {
//                    int id = rs.getInt("id");// 可以使用字段名
//                    String name = rs.getString(2);// 也可以使用字段的顺序
//                    float hp = rs.getFloat("hp");
//                    int damage = rs.getInt(4);
//                    System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
//                }
//              
//            } catch (SQLException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//            }
//    }
//     
//    public static void main(String[] args) {
//       list(10,5);
//    }
//}

public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                "root", "admin"); Statement s = c.createStatement();) {
 
            String sql = "select count(*) from hero";
 
            ResultSet rs = s.executeQuery(sql);
            int total = 0;
            while (rs.next()) {
                total = rs.getInt(1);
            }
 
            System.out.println("表Hero中总共有:" + total+" 条数据");
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
 
    }
}

/*public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java2?characterEncoding=UTF-8",
                "root", "admin");
                Statement s = c.createStatement();
                 
                ) {
            String name = "dashen";
            //正确的密码是：thisispassword
            String password = "thisispassword1";
   
            String sql = "select * from user where name = '" + name +"' and password = '" + password+"'";
              
            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);
              
            if(rs.next())
                System.out.println("账号密码正确");
            else
                System.out.println("账号密码错误");
             
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
   
    }
}*/

/*public class TestJDBC {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java2?characterEncoding=UTF-8",
                "root", "admin"); Statement s = c.createStatement();) {
 
            String sql = "select * from hero";
 
            // 执行查询语句，并把结果集返回给ResultSet
            ResultSet rs = s.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt("id");// 可以使用字段名
                String name = rs.getString(2);// 也可以使用字段的顺序
                float hp = rs.getFloat("hp");
                int damage = rs.getInt(4);
                System.out.printf("%d\t%s\t%f\t%d%n", id, name, hp, damage);
            }
            // 不一定要在这里关闭ReultSet，因为Statement关闭的时候，会自动关闭ResultSet
            // rs.close();
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}*/

/*public class TestJDBC {
	 
    public static void execute(String sql) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
 
        try (Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/how2java2?characterEncoding=UTF-8",
                "root", "admin"); Statement s = c.createStatement();) {
 
            s.execute(sql);
 
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
 
    public static void main(String[] args) {
        execute("delete from hero where id = 3");
    }
}*/

/*public class TestJDBC {

	public static void main(String[] args) {
		Connection c = null;
		Statement s = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			c = DriverManager
					.getConnection(
							"jdbc:mysql://127.0.0.1:3306/how2java2?characterEncoding=UTF-8", 
							"root", "admin"
							);
			s = c.createStatement();
			//for (int i = 0; i < 100; i++) {
				//String sql = "insert into hero values(null, '提莫', 313, 50)";
			//String sql = "delete from hero where id = 5";
			String sql = "update hero set name = 'name5' where id = 3";
				s.execute(sql);
			//}
			//String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")";
			System.out.println("执行插入语句成功");
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (s != null) {
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (c != null) {
				try {
					c.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
}*/
