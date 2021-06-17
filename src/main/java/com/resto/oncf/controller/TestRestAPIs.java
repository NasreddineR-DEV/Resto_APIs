package com.resto.oncf.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class TestRestAPIs {
	
	@GetMapping("/api/test/collaborateur")
	@PreAuthorize("hasRole('COLLABORATEUR')")
	public String userAccess() {
		return ">>> Employe Contents!";
	}

	@GetMapping("/api/test/restaurant")
	@PreAuthorize("hasRole('RESTAURANT')")
	public String projectManagementAccess() {
		return ">>> Restaurant Management Board";
	}

}