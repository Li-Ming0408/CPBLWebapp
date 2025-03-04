package com.ispan.eeit19527.cpbl.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ispan.eeit19527.cpbl.domain.CPBLBean;

@SpringBootTest

public class CPBLDAOImplTest {

	@Autowired
	private CPBLDAO cPBLDAO;

	@Test

	public void testSave() {
		System.out.println("test start");
		CPBLBean bean = new CPBLBean();
		bean.setName("testName");
		System.out.println("fake bean created");
		// System.out.println(cPBLDAO.save(bean));
	}
}
