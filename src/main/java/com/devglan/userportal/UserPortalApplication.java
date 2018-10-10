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



// sudo docker run --name practice -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=dbname -p 3306:3306 mysql:5.7
//sudo docker exec -it practice bash
//mysql -u root -p
//enter "password"
//CREATE TABLE user(id INT NOT NULL AUTO_INCREMENT,email VARCHAR(255),first_name  VARCHAR(255),last_name VARCHAR(255),PRIMARY KEY (id))ENGINE=InnoDB;
//describe user;
/**
 * +------------+--------------+------+-----+---------+----------------+
 * | Field      | Type         | Null | Key | Default | Extra          |
 * +------------+--------------+------+-----+---------+----------------+
 * | id         | int(11)      | NO   | PRI | NULL    | auto_increment |
 * | email      | varchar(255) | YES  |     | NULL    |                |
 * | first_name | varchar(255) | YES  |     | NULL    |                |
 * | last_name  | varchar(255) | YES  |     | NULL    |                |
 * +------------+--------------+------+-----+---------+----------------+
 */