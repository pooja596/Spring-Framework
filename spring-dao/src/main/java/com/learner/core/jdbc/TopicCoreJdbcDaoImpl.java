package com.learner.core.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import org.springframework.stereotype.Component;

@Component
public class TopicCoreJdbcDaoImpl {

	public void insert() {

		Connection con = null;

		try {
			String driver = "org.h2.Driver";

			Class.forName(driver).newInstance();

			Connection conn = DriverManager.getConnection("jdbc:h2:mem:testdb", "h2db", "h2dbPassword");

			String sql = "insert into topic values(3, 'Java-Core-JDBC', 'Java Core JDBC')";

			Statement stmt = conn.createStatement();

			int executeUpdateCount = stmt.executeUpdate(sql);

			System.out.println(executeUpdateCount + " Topic inserted successfully using Core Java Jdbc !!!!");

			stmt.close();

		} catch (Exception e) {
			System.out.println("Inside catch Block" + e);
			throw new RuntimeException(e);
		} finally {
			try {
				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
