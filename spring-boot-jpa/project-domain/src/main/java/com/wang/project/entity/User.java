package com.wang.project.entity;

import javax.persistence.*;

import com.wang.project.BaseEntity;

import lombok.Data;

@Data
@Entity
@Table(name="user")
public class User extends BaseEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -679973882839808516L;
	@Id
	@GeneratedValue
	public int id;
	@Column(name="username",length=20,nullable=false)
	private String name;
	@Column(unique=true,name="account",length=50,nullable=false)
	private String account;
	private String password;
}
