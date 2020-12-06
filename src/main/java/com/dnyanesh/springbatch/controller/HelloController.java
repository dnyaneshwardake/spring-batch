package com.dnyanesh.springbatch.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/rest")
@Slf4j
public class HelloController {
	@GetMapping("/hello")
	public String hello(HttpServletRequest request) {
		String urlPattern = request.getRequestURI();
		log.info("my url pattern way 1 : " + urlPattern);

		// Other way
		UriComponents uriComponent = ServletUriComponentsBuilder.fromCurrentRequestUri().build();
		String path = uriComponent.getPath();
		log.info("my url pattern way 2 : " + urlPattern);
		return urlPattern;
	}

}
