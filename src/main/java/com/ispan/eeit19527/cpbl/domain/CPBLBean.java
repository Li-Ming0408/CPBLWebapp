package com.ispan.eeit19527.cpbl.domain;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class CPBLBean {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String userBuild;
	private LocalDateTime timeBuild;
	private String userUpdate;
	private LocalDateTime timeUpdate;
	
	// Player Statistics
	@Column(columnDefinition = "nvarchar(10)")
	private String name;
	@Column(columnDefinition = "nvarchar(10)")
	private String teamName;
	private Integer season;
	@Column(name="G")
	private Integer g;
	@Column(name="PA")
	private Integer pa;
	@Column(name="AB")
	private Integer ab;
	@Column(name="RBI")
	private Integer rbi;
	@Column(name="H")
	private Integer h;
	@Column(name="HR")
	private Integer hr;
	@Column(name="TB")
	private Integer tb;
	@Column(name="SO")
	private Integer so;
	@Column(name="SF")
	private Integer sf;
	@Column(name="BB")
	private Integer bb;
	@Column(name="AVG")
	private Double avg;
	@Column(name="OBP")
	private Double obp;
	@Column(name="SLG")
	private Double slg;
	@Column(name="OPS")
	private Double ops;
	@Column(name="OPS+")
	private Double opsPlus;
	
}
