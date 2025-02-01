package com.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.phone.common.FrontCtl;

@SpringBootApplication
public class ProjectOMMS {
	
//	@Autowired
//	FrontCtl frontCtl;

	public static void main(String[] args) {
		SpringApplication.run(ProjectOMMS.class, args);
	}

	@Bean
	public WebMvcConfigurer corsConfig() {
		WebMvcConfigurer w = new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
//			@Override
//			public void addInterceptors(InterceptorRegistry registry) {
//				registry.addInterceptor(frontCtl).addPathPatterns("/**").excludePathPatterns("/Auth/**");
//			}
		};
		return w;
	}

}
