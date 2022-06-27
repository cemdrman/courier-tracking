package com.migros.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "Orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	private LocalDateTime createDate;
	@JoinColumn(insertable = true, updatable = false)
	@OneToOne(targetEntity = Point.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Point orderAddress;
	@JoinColumn(insertable = true, updatable = false)
	@OneToOne(targetEntity = Courier.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Courier courier;

}
