package com.jdc.processor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("Bean Factory Post Processor is ready.");

		var beanDefinitionNames = beanFactory.getBeanDefinitionNames();

		for (var beanDefinitionName : beanDefinitionNames) {
			System.out.println(beanDefinitionName);
		}

	}

}
