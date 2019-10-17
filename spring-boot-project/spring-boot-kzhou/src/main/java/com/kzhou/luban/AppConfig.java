package com.kzhou.luban;

import com.kzhou.luban.model.Cat;
import com.kzhou.luban.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class AppConfig {

	public static void main(String[] args) {
		SpringApplication.run(AppConfig.class);
		//ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class);
		//System.out.println(context.getBean(LubanProperties.class).getAge());
	}

}
