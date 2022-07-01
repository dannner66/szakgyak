package com.railnavigator.demo.pojos;

import lombok.Data;

@Data
public class UserListDataPojo {

	private Long userId;
	private String username;
	private String mainNumber;
	private String email;
	private String phoneNumber;
	private String lastActive;
	private String mongoId;

	public UserListDataPojo() {
	}

}
