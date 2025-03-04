package com.ispan.eeit19527.cpbl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ispan.eeit19527.cpbl.domain.CPBLBean;

public interface CPBLRepository extends JpaRepository<CPBLBean,Integer>, CPBLDAO{

}
