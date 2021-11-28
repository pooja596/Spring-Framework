package com.learner.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class TopicJdbcDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insert() {
		String sql = "insert into topic values(1, 'Java-Basic', 'Core java')";

		jdbcTemplate.update(sql);

		System.out.println("Topic inserted successfully!!!!");

	}

}
