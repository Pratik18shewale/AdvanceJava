package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@JsonIgnoreType

public class Product extends BaseEntity{
	
	@Column(name="pname", length=20, nullable=false)
	private String pname;

	@Column(name="pcode",unique=true,nullable=false)
	private Integer pcode;
	
	@Column(name="mfgdate", nullable=false)
	private LocalDate mfgdate;
	
	@Enumerated(EnumType.STRING)
	private Category category;

}
