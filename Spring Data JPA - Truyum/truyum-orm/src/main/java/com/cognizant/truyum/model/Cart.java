package com.cognizant.truyum.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cart_id")
	private int id;

	@ManyToOne
	@JoinColumn(name = "mi_id")
	private MenuItem menuItem;

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(int id, MenuItem menuItem, User user) {
		super();
		this.id = id;
		this.menuItem = menuItem;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Cart [menuItemList=" + ", total=" + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public MenuItem getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(MenuItem menuItem) {
		this.menuItem = menuItem;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}