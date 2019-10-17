
package com.kzhou.luban;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * ConfigurationProperties注解表示可以从application.yml等配置文件取信息
 * Component表示组件，Spring是通过注解和spring.factories从所有的
 * 		EnableAutoConfiguration 配置文件中取的
 */
@Component
@ConfigurationProperties(prefix = "luban", ignoreUnknownFields = true)
public class LubanProperties {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
