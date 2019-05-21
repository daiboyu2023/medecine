package com.medecine;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan({"com.medecine.*.dao"})
@EnableTransactionManagement
public class MedecineApplication {
	public static void main(String[] args) {
		SpringApplication.run(MedecineApplication.class, args);
	}
}
