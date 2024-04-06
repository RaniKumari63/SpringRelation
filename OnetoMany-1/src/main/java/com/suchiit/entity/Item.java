package com.suchiit.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Item {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String serialNumber;
@ManyToOne
@JoinColumn(name="cart_id",referencedColumnName="id1")
private Cart cart;
}
