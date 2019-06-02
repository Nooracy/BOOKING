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
	//��������
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * �������Ӷ���
	 * @throws SQLException 
	 * @����˵��  �������Ӷ���
	 */
	private void getConn() {
		 try {
			  conn = 
					 DriverManager.getConnection(url, user, password);
			System.out.println("�������ݿ�ɹ�");
		} catch (SQLException e) {
			System.out.println("�������ݿ�ʧ��");
		}

	}
	
	
	/**
	 * ��ɾ�ĵķ���
	 * @���� String sql = Ҫִ�еĴ���ռλ����sql�����߾�̬���
	 * @���� Object sqlParams[]Ҫ��վλ�������ֵ������Ϊnull
	 * @����ֵ int���͵Ĳ������ݿ�ʱ��Ӱ������
	 * @����˵�� ֻ����ִ����ɾ�ĵ�sql��䷽��<br>
	 * 	��ִ�� sql=insert into ����������<br>
	 * 	��ִ�� sql=delete from ����������<br>
	 * 	��ִ�� sql=update set  ����������<br>
	 */
	public int doUpdate(String sql ,Object sqlParams[]) {
		getConn();
		int k = 0;
		try {
			 stmt = conn.prepareStatement(sql);
			/*
			 * ��ռλ����ֵ
			 */
			if (sqlParams==null) {
				sqlParams = new Object[]{};
			}
			for (int i = 0; i < sqlParams.length; i++) {
				stmt.setObject(i+1, sqlParams[i]);
			}
			
			System.out.println("ִ�е�sql���Ϊ��"+stmt.toString());
			//ִ��SQL���
			k = stmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return k;
	}
	
	
	/**
	 * ִ�в�ѯ�ķ���
	 * @���� String sql = Ҫִ�еĴ���ռλ����sql�����߾�̬���
	 * @���� Object sqlParams[]Ҫ��վλ�������ֵ������Ϊnull
	 * @����ֵ ResultSet���������
	 * @��������
	 * 	ֻ��ִ�в�ѯ��sql���<br>
	 *  �磺sql=select * from .........
	 *  �磺sql=show tables .....
	 */
	public ResultSet doQuery(String sql,Object sqlParams[]) {
		getConn();
		try {
			 stmt = conn.prepareStatement(sql);
			/*
			 * ��ռλ����ֵ
			 */
			if (sqlParams==null) {
				sqlParams = new Object[]{};
			}
			for (int i = 0; i < sqlParams.length; i++) {
				stmt.setObject(i+1, sqlParams[i]);
			}
			System.out.println("ִ�е�sql���Ϊ��"+stmt.toString());
			//ִ��sql���
			rs = stmt.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	
	
	/**
	 * �ͷ�jdbc����Դ
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
