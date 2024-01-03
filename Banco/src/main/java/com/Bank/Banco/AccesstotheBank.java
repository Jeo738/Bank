package com.Bank.Banco;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_typeuser")
public class AccesstotheBank {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;	
private String Name;
private String Password;

public AccesstotheBank() {
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
	
 


}
