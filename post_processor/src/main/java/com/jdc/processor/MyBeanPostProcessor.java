package com.jdc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import com.jdc.beans.MyBean;

@Component
public class MyBeanPostProcessor implements BeanPostProcessor {
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		
		if(bean instanceof MyBean myBean) {
			System.out.println("heere we go");
			myBean.setValue("Hello from bean post processor.");
		}
		return bean;
	}

}
