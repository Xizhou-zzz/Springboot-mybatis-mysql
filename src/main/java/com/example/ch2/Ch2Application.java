package com.example.ch2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.example.ch2.mapper")
public class Ch2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ch2Application.class, args);
	}

}
