package com.kzhou.luban;

import com.kzhou.luban.model.Cat;
import com.kzhou.luban.model.Dog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class AppConfig {

	public static void main(String[] args) {
		/**
		 * 如果你问你SpringBoot和SpringFrame的核心区别是什么
		 * 那么就是自动装配和内嵌tomcat,零XML
		 */
		//SpringApplication.run(AppConfig.class);
		ConfigurableApplicationContext context = SpringApplication.run(AppConfig.class);
		System.out.println(context.getBean(LubanProperties.class).getAge());
	}

}
