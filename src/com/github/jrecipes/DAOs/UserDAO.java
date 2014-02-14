package com.github.jrecipes.DAOs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.github.jrecipes.models.User;

@Component("userDao")
public class UserDAO {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}
	
	/**
	 * This method add a row User into the table.
	 * @param user that is added.
	 * @return true if it's added, false if it is not.
	 */
	public boolean create(User user) {
		BeanPropertySqlParameterSource parameters = new BeanPropertySqlParameterSource(
				user);

		return jdbc
				.update("insert into User (name, surname, nickname, email, password, nation, job)"
						+ " values (:name, :surname, :nickname, :email, :password, :nation, :job)", parameters) == 1;
	}

	
}
