package com.example.SpringMyBatisGradle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"data.*","naver.storage"})
public class SpringMyBatisGradleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMyBatisGradleApplication.class, args);
	}

}
