package com.tavant.address.payload.request;

import javax.validation.constraints.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
 @Data
 @AllArgsConstructor
 @NoArgsConstructor
public class SignupRequest {
    @NotBlank(message="username not be blank")
    @Size(min = 3, max = 20)
    private String username;
 
    @NotBlank(message="email not be blank")
    @Size(max = 50)
    @Email
    private String email;
    @NotBlank(message="password not be blank")
    @Size(min = 6, max = 40)
    private String password;
}
