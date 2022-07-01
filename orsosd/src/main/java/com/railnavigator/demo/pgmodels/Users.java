package com.railnavigator.demo.pgmodels;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
public class Users implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long userId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "main_number")
	private String mainNumber;

	@Column(name = "email")
	private String email;

	@Column(name = "mothers_name")
	private String mothersName;

	@Column(name = "date_of_birth")
	@Temporal(TemporalType.DATE)
	private Date dateOfBirth;

	@Column(name = "place_of_birth")
	private String placeOfBirth;

	@Column(name = "id_card_num")
	private String idCardNum;

	@Column(name = "tax_number")
	private String taxNumber;

	@Column(name = "taj_number")
	private String tajNumber;

	@Column(name = "phone_number")
	private String phoneNumber;

	@Column(name = "lang")
	private String lang;

}
