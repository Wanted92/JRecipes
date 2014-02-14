package com.github.jrecipes.DAOs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;

import com.github.jrecipes.models.Recipe;

@Component
public class RecipeDAO {

	private NamedParameterJdbcTemplate jdbc;

	@Autowired
	public void setDataSource(DataSource jdbc) {
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	/**
	 * This method creates a row in a table recipe.
	 * @param recipe
	 * @return
	 */
	public boolean create(Recipe recipe) {
		BeanPropertySqlParameterSource parameters = new BeanPropertySqlParameterSource(
				recipe);

		return jdbc
				.update("insert into Recipe (name, nationality, region, difficulty, price, "
						+ "average, preparationTime, cookingTime, note, nop, userId) values "
						+ "(:name, :nationality, :region, :difficulty, :price, :average, :preparationTime, :cookingTime, "
						+ ":note, :nop, :userId)", parameters) == 1;
	}
}
