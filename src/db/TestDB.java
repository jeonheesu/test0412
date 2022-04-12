package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TestDB {

	
	public void insert(String tName, String tID , String tPW , String tAddress) {
		Connection conn = null;
		PreparedStatement pstmt = null;

		String dbURL = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false";
		String dbID = "root";
		String dbPW = "rootroot";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPW);

			String sql = "insert into testDB(tName, tID, tPW, tAddress) " + " values (?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, tName);
			pstmt.setString(2, tID);
			pstmt.setString(3, tPW);
			pstmt.setString(4, tAddress);
			pstmt.executeUpdate();

			System.out.println("MemberDTO insert() 메서드 실행 완료");

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (pstmt != null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}

			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}


