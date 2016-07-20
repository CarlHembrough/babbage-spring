package com.github.onsdigital.babbage;

import de.neuland.jade4j.JadeConfiguration;
import de.neuland.jade4j.spring.template.SpringTemplateLoader;
import de.neuland.jade4j.spring.view.JadeViewResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.ViewResolver;

@SpringBootApplication
public class BabbageSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(BabbageSpringApplication.class, args);
	}

	@Bean
	public SpringTemplateLoader templateLoader() {
		SpringTemplateLoader templateLoader = new SpringTemplateLoader();
		templateLoader.setBasePath("classpath:/views/");
		templateLoader.setEncoding("UTF-8");
		templateLoader.setSuffix(".jade");
		return templateLoader;
	}

	@Bean
	public JadeConfiguration jadeConfiguration() {
		JadeConfiguration configuration = new JadeConfiguration();
		configuration.setCaching(false);
		configuration.setTemplateLoader(templateLoader());
		return configuration;
	}

	@Bean
	public ViewResolver viewResolver() {
		JadeViewResolver viewResolver = new JadeViewResolver();
		viewResolver.setConfiguration(jadeConfiguration());
		return viewResolver;
	}

	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename("classpath:LabelsBundle");
		return source;
	}
}
