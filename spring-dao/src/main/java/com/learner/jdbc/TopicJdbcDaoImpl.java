package com.learner.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.learner.entity.Topic;

@Repository
public class TopicJdbcDaoImpl {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insert() {
		String sql = "insert into topic values(1, 'Java-Basic', 'Core java')";

		jdbcTemplate.update(sql);

		System.out.println("Topic inserted successfully using JdbcTemplate!!!!");

	}

	public int getCount() {

		String sql = "select count(*) from topic";

		Integer topicCount = jdbcTemplate.queryForObject(sql, Integer.class);

		System.out.println("Topic Count :" + topicCount);
		return topicCount;

	}

	public Topic getTopic(int topicId) {

		String sql = "select * from topic where id= ?";

		List<Topic> topicList = jdbcTemplate.query(sql, new TopicRowMapper(), new Object[] { topicId });

		Topic topic = topicList.size() > 0 ? topicList.get(0) : null;

		System.out.println("Topic :" + topic);
		return topic;

	}

	public List<Topic> getAllTopic() {

		String sql = "select * from topic ";

		List<Topic> topicList = jdbcTemplate.query(sql, new TopicRowMapper());

		return topicList;

	}

	private static final class TopicRowMapper implements RowMapper<Topic> {

		@Override
		public Topic mapRow(ResultSet rs, int rowNum) throws SQLException {
			Topic topic = new Topic();
			topic.setId(rs.getInt("ID"));
			topic.setName(rs.getString("Name"));
			topic.setDescription(rs.getString("Description"));

			return topic;
		}

	}

}
