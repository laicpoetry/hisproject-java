package com.neuedu.hisproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@MapperScan("com.neuedu.hisproject.mapper")
@SpringBootApplication
public class HisprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HisprojectApplication.class, args);
	}

}
