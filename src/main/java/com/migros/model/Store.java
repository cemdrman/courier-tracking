package com.migros.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Store {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private String id;
	private String name;
	@OneToOne(targetEntity = Point.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Point point;
	@OneToMany(targetEntity = Courier.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<Courier> courierList;

}
