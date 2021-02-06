package com.example.demo.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCdiBusiness {
	
	@Inject
	SomeCdiDao dao;

	public SomeCdiDao getDao() {
		return dao;
	}

	public void setDao(SomeCdiDao dao) {
		this.dao = dao;
	}	
}
