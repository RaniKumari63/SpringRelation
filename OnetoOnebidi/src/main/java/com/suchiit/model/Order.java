package com.suchiit.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Order {
	

	public Order(Long id, String orderTrackingNumber, int totalQuantity, float totalPrice, String status,
			Address billingAddress) {
		super();
		this.id = id;
		this.orderTrackingNumber = orderTrackingNumber;
		this.totalQuantity = totalQuantity;
		this.totalPrice = totalPrice;
		this.status = status;
		this.billingAddress = billingAddress;
	}

	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="id")
	    private Long id;

	    @Column(name="order_tracking_number")
	    private String orderTrackingNumber;

	    @Column(name="total_quantity")
	    private int totalQuantity;

	    @Column(name="total_price")
	    private float totalPrice;

	    @Column(name="status")
	    private String status;

	    @Column(name="date_created")
	    @CreationTimestamp
	    private Date dateCreated;

	    @Column(name="last_updated")
	    @UpdateTimestamp
	    private Date lastUpdated;

	    @OneToOne(cascade=CascadeType.ALL)
	//	@JoinColumn(name="address_id")
	     Address billingAddress;
}
