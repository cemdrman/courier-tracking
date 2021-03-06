package com.migros.model;

import java.time.LocalDateTime;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
public class CourierLog {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	@JoinColumn(insertable = true, updatable = false)
	@OneToOne(targetEntity = Courier.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Courier courier;
	@JoinColumn(insertable = true, updatable = false)
	@OneToOne(targetEntity = Store.class, cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Store store;
	@Column
	private LocalDateTime entranceTime;

	public CourierLog(Courier courier, Store store, LocalDateTime entranceTime) {
		this.courier = courier;
		this.store = store;
		this.entranceTime = entranceTime;
	}

}
