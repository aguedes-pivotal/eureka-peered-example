package com.alexguedes.eurekamaster;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EurekaMasterController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping("/master")
	public String sayHello() {
		return restTemplate.getForObject("http://eurekaclient/hello", String.class);
	}

}
