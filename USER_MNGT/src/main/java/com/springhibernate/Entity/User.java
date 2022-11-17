package com.springhibernate.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
//class User is the entity class
public class User {

	//data members of class User
	@Id
	private int uid;
	private String uname;
	private String upassword;
}
