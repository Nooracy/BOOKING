package Util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
	private  String url = "jdbc:mysql://localhost:3306/BookingSystem";
	private  String user = "root";
	private  String password = "kuai0709";
	private  Connection conn = null;
	private  ResultSet rs = null;
	private  PreparedStatement stmt = null;
	//加载驱动
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 创建连接对象
	 * @throws SQLException 
	 * @方法说明  创建连接对象
	 */
	private void getConn() {
		 try {
			  conn = 
					 DriverManager.getConnection(url, user, password);
			System.out.println("连接数据库成功");
		} catch (SQLException e) {
			System.out.println("连接数据库失败");
		}

	}
	
	
	/**
	 * 增删改的方法
	 * @参数 String sql = 要执行的带有占位符的sql语句或者静态语句
	 * @参数 Object sqlParams[]要给站位符赋予的值，可以为null
	 * @返回值 int类型的操作数据库时的影响行数
	 * @方法说明 只可以执行增删改的sql语句方法<br>
	 * 	如执行 sql=insert into 。。。。。<br>
	 * 	如执行 sql=delete from 。。。。。<br>
	 * 	如执行 sql=update set  。。。。。<br>
	 */
	public int doUpdate(String sql ,Object sqlParams[]) {
		getConn();
		int k = 0;
		try {
			 stmt = conn.prepareStatement(sql);
			/*
			 * 给占位符赋值
			 */
			if (sqlParams==null) {
				sqlParams = new Object[]{};
			}
			for (int i = 0; i < sqlParams.length; i++) {
				stmt.setObject(i+1, sqlParams[i]);
			}
			
			System.out.println("执行的sql语句为："+stmt.toString());
			//执行SQL语句
			k = stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;
	}
	
	
	/**
	 * 执行查询的方法
	 * @参数 String sql = 要执行的带有占位符的sql语句或者静态语句
	 * @参数 Object sqlParams[]要给站位符赋予的值，可以为null
	 * @返回值 ResultSet结果集对象
	 * @方法描述
	 * 	只能执行查询的sql语句<br>
	 *  如：sql=select * from .........
	 *  如：sql=show tables .....
	 */
	public ResultSet doQuery(String sql,Object sqlParams[]) {
		getConn();
		try {
			 stmt = conn.prepareStatement(sql);
			/*
			 * 给占位符赋值
			 */
			if (sqlParams==null) {
				sqlParams = new Object[]{};
			}
			for (int i = 0; i < sqlParams.length; i++) {
				stmt.setObject(i+1, sqlParams[i]);
			}
			System.out.println("执行的sql语句为："+stmt.toString());
			//执行sql语句
			rs = stmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	/**
	 * 释放jdbc的资源
	 * @param args
	 * @throws SQLException
	 */
	public void getClose() {
			try {
				
				if (stmt!=null) {
					stmt.close();
				}          
				if (rs!=null) {
					rs.close();
				}          
				if (conn!=null) {
					conn.close();
				}          
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}   

	}

}
