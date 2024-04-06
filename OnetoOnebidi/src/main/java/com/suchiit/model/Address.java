package com.suchiit.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="ads")
public class Address {
	

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name="address_id")
	    private Long id;

	
	    private String street;

	 
	    private String city;

	    private String state;

	   
	    private String country;

	  
	    public Address(String street, String city, String state, String country, String zipCode) {
			super();
			this.street = street;
			this.city = city;
			this.state = state;
			this.country = country;
			this.zipCode = zipCode;
		}


		public Address(String street, String city, String state, String zipCode) {
			super();
			this.street = street;
			this.city = city;
			this.state = state;
			this.zipCode = zipCode;
		}


		private String zipCode;

		/*
		 * @OneToOne(cascade = CascadeType.ALL)
		 * 
		 * @JoinColumn(name = "order_id", referencedColumnName = "id") private Order
		 * order;
		 */
}
