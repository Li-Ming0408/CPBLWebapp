package com.ispan.eeit19527.cpbl.service;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.ispan.eeit19527.cpbl.domain.CPBLBean;
import com.ispan.eeit19527.cpbl.repository.CPBLRepository;

@SpringBootTest
@EnableTransactionManagement
@DirtiesContext
public class CPBLServiceTest {

	@Autowired
	private CPBLService cPBLService;
	@Autowired
	private CPBLRepository cPBLRepository;
	
//	@Test
//	public void testInsert() {
//		CPBLBean bean = new CPBLBean();
//		bean.setName("testName");
//		try {
//			System.out.println(cPBLService.insert(bean));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void testDelete() {
//		CPBLBean bean = new CPBLBean();
//		bean.setId(1);
//		System.out.println("delete target ready");
//		try {
//			cPBLService.delete(bean);
//			
//			System.out.println("deleted, existence = "+cPBLRepository.existsById(1));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	@Test
//	public void testUpdate() {
//		CPBLBean bean = new CPBLBean();
//		bean.setName("HAHAHAHA");
//		cPBLService.insert(bean);
//		System.out.println("bean="+bean);
//		bean.setName("!!!!!!!!!");
//		bean.setId(bean.getId()+1);
//		System.out.println("bean="+bean);
//		cPBLService.update(bean);
//		Optional<CPBLBean> optional = cPBLRepository.findById(bean.getId());
//		if(cPBLService.update(bean) && optional.isPresent()) {
//			System.out.println("update success, now bean's name is "+optional.get().getName());
//		}else {
//			System.out.println("update failed");
//		}
//	}
//	@Test
//	public void testSelectById() {
//		CPBLBean bean = new CPBLBean();
//		bean.setName("123");
//		try {
//			cPBLService.insert(bean);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			System.out.println("1");
//			System.out.println(cPBLRepository.findById(2));
//			System.out.println("2");
//			System.out.println(cPBLRepository.findById(100));
//			System.out.println("3");
//			System.out.println(cPBLService.selectById(2));
//			System.out.println("4");
//			System.out.println(cPBLService.selectById(100));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
}
