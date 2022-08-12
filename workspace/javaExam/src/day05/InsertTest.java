package day05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertTest {
	public static void main(String[] args) throws Exception {
		// 1. 접속 -- Connection
		Class.forName("com.mysql.cj.jdbc.Driver");

		String url = "jdbc:mysql://127.0.0.1:3306/skudb";
		String user = "sku";
		String password = "skupw";

		Connection conn = DriverManager.getConnection(url, user, password);

		// 2. 쿼리 작성 -- PreparedStatement
		String sql = "insert into member values(?, ?, ?, ?, default)";

		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, "soyeon");
		ps.setString(2, "이소연");
		ps.setString(3, "soyeonpw");
		ps.setString(4, "soyeon@soyeon.com");

		// 3. 쿼리 실행
		int resultCount = ps.executeUpdate();

		// 4. 쿼리 결과를 확인 !!
		if (resultCount > 0) {
			System.out.println(resultCount + "건 입력 ^^");
		}

		// 5. 접속 종료 !!!! (반드시 !!)
		if (ps != null)
			ps.close();
		if (conn != null)
			conn.close();
	}
}
