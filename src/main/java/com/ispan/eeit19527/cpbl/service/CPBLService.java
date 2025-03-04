package com.ispan.eeit19527.cpbl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ispan.eeit19527.cpbl.domain.CPBLBean;
import com.ispan.eeit19527.cpbl.repository.CPBLRepository;

@Service
@Transactional
public class CPBLService {

	@Autowired
	private CPBLRepository cPBLRepository;

	public CPBLBean insert(CPBLBean bean) {
		if(bean != null) {
			cPBLRepository.save(bean);
		}
		return bean;
	}
	
	public boolean delete(CPBLBean bean) {
		if(bean != null && cPBLRepository.existsById(bean.getId())) {
			cPBLRepository.deleteById(bean.getId());
			return true;
		}
		return false;
	}
	
	public boolean deleteById(Integer id) {
		if(cPBLRepository.existsById(id)) {
			cPBLRepository.deleteById(id);
			return true;
		}
		return false;
	}
	
	public boolean update(CPBLBean bean) {
		if(bean != null && cPBLRepository.existsById(bean.getId())) {
			cPBLRepository.save(bean);
			return true;
		}
		return false;
	}
	
	public CPBLBean selectById(Integer id) {
		if(id != null && cPBLRepository.existsById(id)) {
			return cPBLRepository.findById(id).get();
		}
		return null;
	}
	
//	public boolean deleteByList(List<Integer> list) {
//		if(list == null || list.isEmpty()) {
//			return false;
//		}
//	}
//	
//	public List<CPBLBean> selectByName(String name){
//		
//	}
	
}
