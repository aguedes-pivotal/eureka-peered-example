package com.alexguedes.eurekaclient;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaClientController {

	@RequestMapping("/hello")
	public String sayHello() throws UnknownHostException {
		InetAddress inetAddress = InetAddress.getLocalHost();
		return inetAddress.getHostName();
	}

}
