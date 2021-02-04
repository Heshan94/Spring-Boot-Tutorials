package com.example.demo.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDao {
	
	@Autowired
	JdbcConnection jdbc;

	public JdbcConnection getJdbc() {
		return jdbc;
	}

	public void setJdbc(JdbcConnection jdbc) {
		this.jdbc = jdbc;
	}
}
