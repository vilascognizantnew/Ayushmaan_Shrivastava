package com.cts.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.security.util.JwtUtil;
import com.cts.security.models.AuthenticationRequest;
import com.cts.security.models.AuthenticationResponse;
import com.cts.security.models.UserInput;
import com.cts.security.services.MyUserDetailsService;

@RestController
public class Controller {

	@Autowired
	private JwtUtil jwtUtil;

	@Autowired
	private MyUserDetailsService userDetailsService;

	@Autowired
	private AuthenticationManager authenticationManager;

	@GetMapping("/hello")
	public String home() {
		return "hello";
	}
	@GetMapping("/hi")
	public String hi() {
		return "hello";
	}

	@PostMapping("/authenticate")
	public ResponseEntity createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest)
			throws Exception {

		try {
			System.out.println(authenticationRequest.getUsername() + " " + authenticationRequest.getPassword());

			authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(
					authenticationRequest.getUsername(), authenticationRequest.getPassword()));
		} catch (BadCredentialsException e) {
			throw new Exception("Incorrect Username & Password : " + e);
		}

		final UserDetails userDetails = userDetailsService.loadUserByUsername(authenticationRequest.getUsername());

		final String jwt = jwtUtil.generateToken(userDetails);

		return ResponseEntity.ok(new AuthenticationResponse(jwt));

	}
	
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public ResponseEntity<?> saveUser(@RequestBody UserInput user) throws Exception {
		return ResponseEntity.ok(userDetailsService.save(user));
	}
}