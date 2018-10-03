package com.devglan.userportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.devglan.userportal")
@EntityScan(basePackages = "com.devglan.userportal")
@EnableAutoConfiguration
@EnableJpaRepositories(basePackages = "com.devglan.userportal")
public class UserPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserPortalApplication.class, args);
	}
}



// sudo docker run --name mysql -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=dbname -p 3306:3306 mysql:5.7

