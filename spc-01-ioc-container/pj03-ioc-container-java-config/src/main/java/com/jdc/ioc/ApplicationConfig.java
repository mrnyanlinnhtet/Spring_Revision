package com.jdc.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.ioc.bean.HelloSpringBean;

@Configuration
public class ApplicationConfig {

	@Bean
	 public HelloSpringBean helloSpringBean() {
		 return new HelloSpringBean();
	 }
}
