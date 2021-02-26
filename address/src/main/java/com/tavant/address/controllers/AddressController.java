package com.tavant.address.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tavant.address.models.Address;
import com.tavant.address.repository.AddressRepository;
import com.tavant.address.security.services.FileStorageService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/address")
public class AddressController {
	@Autowired
	AddressRepository addressRepository;
	
	@PostMapping("/add")
	public Address createAddress(@RequestBody @Valid Address address) {
		
		return addressRepository.save(address);
	}
	@GetMapping("/all")
	public List<Address> getAllAddresses(){
		return addressRepository.findAll();
	}		
	

}
