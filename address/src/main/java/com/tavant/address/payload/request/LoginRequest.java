package com.tavant.address.payload.request;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginRequest {
	@NotBlank(message="username not be blank")
	private String username;

	@NotBlank(message="password not be blank")
	private String password;
}
