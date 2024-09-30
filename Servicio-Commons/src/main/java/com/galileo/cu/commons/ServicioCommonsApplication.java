package com.galileo.cu.commons;

import javax.persistence.Entity;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Entity
@SpringBootApplication
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
public class ServicioCommonsApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("**************************************");
		System.out.println("COMMONS V-24-09-30 14:53");
	}

}
