package com.spring.example;

import java.util.Map;

import org.springframework.batch.item.database.ItemSqlParameterSourceProvider;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public class GenericSqlParameterSourceProvider implements
		ItemSqlParameterSourceProvider<Map> {


	@Override
	public SqlParameterSource createSqlParameterSource(Map item) {
		return new MapSqlParameterSource(item);
	}
}