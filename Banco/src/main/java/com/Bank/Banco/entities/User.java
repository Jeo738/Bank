package com.Bank.Banco.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_user")
public class User {
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String Name;
private String Password;

 @ManyToOne
 @JoinColumn(name = "typeuser_id")
public AccesstotheBank accesstothebank;

public User() {
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getPassword() {
	return Password;
}

public void setPassword(String password) {
	Password = password;
}

public AccesstotheBank getAccesstothebank() {
	return accesstothebank;
}

public void setAccesstothebank(AccesstotheBank accesstothebank) {
	this.accesstothebank = accesstothebank;
}



}
