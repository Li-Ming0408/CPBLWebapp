package com.ispan.eeit19527.cpbl.repository;

import java.util.List;

import com.ispan.eeit19527.cpbl.domain.CPBLBean;

public interface CPBLDAO {

	public List<CPBLBean> findPlayersByCriteria(String name, String teamName, Integer season);
//	public Long countPlayersByCriteria(String name, String teamName, Integer season);
}
