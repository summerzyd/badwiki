package com.github.xufengtian14.badwiki;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.github.xufengtian14.badwiki.mapper")
@SpringBootApplication
public class BadwikiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BadwikiApplication.class, args);
	}
}
