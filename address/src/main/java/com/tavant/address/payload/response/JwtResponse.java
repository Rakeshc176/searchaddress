package com.tavant.address.payload.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class JwtResponse {
	private String token;
	private String type = "Bearer";
	private Long id;
	private String username;
	private String email;

	public JwtResponse(String token, Long id, String username, String email) {
		this.token = token;
		this.id = id;
		this.username = username;
		this.email = email;
	}
}
