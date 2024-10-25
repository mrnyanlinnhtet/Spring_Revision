package com.jdc.spring.online;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloSpringController {

	@GetMapping
	 List<String> index() {
		 return Arrays.asList(DayOfWeek.values())
				             .stream()
				             .map(day -> "Hello  %s".formatted(day))
				             .toList();
	 }
}
