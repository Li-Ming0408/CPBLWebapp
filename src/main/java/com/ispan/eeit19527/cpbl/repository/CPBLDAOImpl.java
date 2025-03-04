package com.ispan.eeit19527.cpbl.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ispan.eeit19527.cpbl.domain.CPBLBean;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

@Repository
public class CPBLDAOImpl implements CPBLDAO {

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<CPBLBean> findPlayersByCriteria(String name, String teamName, Integer season) {
		
		CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<CPBLBean> cq = cb.createQuery(CPBLBean.class);
        Root<CPBLBean> root = cq.from(CPBLBean.class);
        List<Predicate> predicates = new ArrayList<>();
        
        if (name != null && !name.isBlank()) {
            predicates.add(cb.equal(root.get("name"), name));
        }
        if (teamName != null && !teamName.isBlank()) {
            predicates.add(cb.equal(root.get("teamName"), teamName));
        }
        if (season != null) {
            predicates.add(cb.equal(root.get("season"), season));
        }
        
        cq.select(root);
        if (!predicates.isEmpty()) {
            cq.where(cb.and(predicates.toArray(new Predicate[0])));
        }
        
        return entityManager.createQuery(cq).getResultList();
	}
}
//	@Override
//	public Long countPlayersByCriteria(String name, String teamName, Integer season) {
//        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
//        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
//        Root<CPBLBean> root = cq.from(CPBLBean.class);
//        List<Predicate> predicates = new ArrayList<>();
//        
//        if (name != null && !name.isBlank()) {
//            predicates.add(cb.equal(root.get("name"), name));
//        }
//        if (teamName != null && !teamName.isBlank()) {
//            predicates.add(cb.equal(root.get("teamName"), teamName));
//        }
//        if (season != null) {
//            predicates.add(cb.equal(root.get("season"), season));
//        }
//        
//        cq.select(cb.count(root));
//        if (!predicates.isEmpty()) {
//            cq.where(cb.and(predicates.toArray(new Predicate[0])));
//        }
//
//        return entityManager.createQuery(cq).getSingleResult();
//    }
	
	


