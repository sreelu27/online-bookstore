package com.sree.onlinebookstore.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_category")
public class BookCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="category_name")
	private String categoryName;
	
	@OneToMany(cascade= CascadeType.ALL, mappedBy="category")
	private Set<Book> book;
	
	public long getId() {
		return id;
	}
	
	@Override
	public String toString() {
		return "BookCategory [id=" + id + ", categoryName=" + categoryName + "]";
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getCategoryName() {
		return categoryName;
	}
	
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

}
